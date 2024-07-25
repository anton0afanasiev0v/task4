package t1.course.task4.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import t1.course.task4.validation.EqualFields;
import t1.course.task4.validation.password.PasswordValidator;

@Data
@EqualFields(baseField = "password", matchField = "reEnteredPassword")
public class SignUpRequest {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Email
    private String email;

    @Size(min = 8, max = 255)
    @NotBlank
    private String password;

    @NotBlank
    @PasswordValidator
    private String reEnteredPassword;

    private String token;
}