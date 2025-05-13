package kr.co.csalgo.domain.user.entity;

import jakarta.persistence.*;
import kr.co.csalgo.domain.common.entity.AuditableEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class User extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;


    @Builder
    public User(String email, LocalDateTime createdAt, LocalDateTime deletedAt) {
        this.email = email;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }
}
