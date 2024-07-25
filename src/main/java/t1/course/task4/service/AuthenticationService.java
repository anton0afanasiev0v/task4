package t1.course.task4.service;


import lombok.NonNull;
import t1.course.task4.dto.request.SignInRequest;
import t1.course.task4.dto.request.SignUpRequest;
import t1.course.task4.dto.response.JwtAuthenticationResponse;
import t1.course.task4.model.User;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

    User getCurrentUserDetails();
}
