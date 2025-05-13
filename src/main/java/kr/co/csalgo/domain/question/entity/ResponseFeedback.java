package kr.co.csalgo.domain.question.entity;

import jakarta.persistence.*;
import kr.co.csalgo.domain.common.entity.AuditableEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class ResponseFeedback extends AuditableEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "response_id", nullable = false)
    private QuestionResponse response;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Builder
    public ResponseFeedback(QuestionResponse response, String content) {
        this.response = response;
        this.content = content;
    }
}
