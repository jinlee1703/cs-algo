package kr.co.csalgo.domain.question.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import kr.co.csalgo.domain.common.entity.AuditableEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Question extends AuditableEntity {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String solution;

    @Builder
    public Question(String title, String description, String solution) {
        this.title = title;
        this.description = description;
        this.solution = solution;
    }
}
