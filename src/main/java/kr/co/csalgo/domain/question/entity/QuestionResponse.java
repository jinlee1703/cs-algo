package kr.co.csalgo.domain.question.entity;

import jakarta.persistence.*;
import kr.co.csalgo.domain.common.entity.AuditableEntity;
import kr.co.csalgo.domain.user.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class QuestionResponse extends AuditableEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Builder
    public QuestionResponse(Question question, User user, String content) {
        this.question = question;
        this.user = user;
        this.content = content;
    }
}
