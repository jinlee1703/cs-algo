package kr.co.csalgo.presentation.user;

import kr.co.csalgo.application.user.dto.RegisterUserReq;
import kr.co.csalgo.application.user.dto.RegisterUserRes;
import kr.co.csalgo.application.user.usecase.RegisterUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/subscriptions")
public class UserController {
    private final RegisterUserUseCase registerUserUseCase;

    @PostMapping
    public ResponseEntity<RegisterUserRes> registerUser(@RequestBody RegisterUserReq request) {
        return ResponseEntity.ok(registerUserUseCase.create(request));
    }

}
