package kr.co.csalgo.application.user.dto;

import kr.co.csalgo.domain.user.entity.User;
import lombok.Builder;
import lombok.Data;

@Data
public class RegisterUserRes {

    private Long subscriptionId;

    @Builder
    public RegisterUserRes(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public static RegisterUserRes fromEntity(User user) {
        return RegisterUserRes.builder()
                .subscriptionId(user.getId())
                .build();
    }
}
