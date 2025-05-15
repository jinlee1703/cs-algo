package kr.co.csalgo.application.user.usecase;

import kr.co.csalgo.application.user.dto.RegisterUserReq;
import kr.co.csalgo.application.user.dto.RegisterUserRes;
import kr.co.csalgo.domain.user.entity.User;
import kr.co.csalgo.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUserUseCase {

    private final UserService userService;

    public RegisterUserRes create(RegisterUserReq request) {
        User user = userService.create(request.getEmail());
        return RegisterUserRes.fromEntity(user);
    }

}
