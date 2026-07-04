package com.eduflow.substitute.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "substitutes")
public class Substitute extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String assignmentScope;

    protected Substitute() {
    }

    private Substitute(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.assignmentScope = builder.assignmentScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAssignmentScope() {
        return assignmentScope;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String assignmentScope;

        private Builder() {
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder assignmentScope(String assignmentScope) {
            this.assignmentScope = assignmentScope;
            return this;
        }

        public Substitute build() {
            return new Substitute(this);
        }
    }
}
