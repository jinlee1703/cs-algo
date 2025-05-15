package kr.co.csalgo.domain.user.service;

import kr.co.csalgo.domain.user.entity.User;
import kr.co.csalgo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(String email) {
        User user = User.builder()
                .email(email)
                .build();
        userRepository.save(user);
        return user;
    }
}
