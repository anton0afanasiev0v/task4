package t1.course.task4.validation.password;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFieldValidator implements ConstraintValidator<PasswordValidator, String> {


    public final static String REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{}|'])[\\w!@#$%^&*()_+\\-=\\[\\]{}|']{8,128}$";

    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(value)) {
            return false;
        }

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
