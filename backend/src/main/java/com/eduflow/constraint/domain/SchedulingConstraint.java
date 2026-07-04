package com.eduflow.constraint.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "scheduling_constraints")
public class SchedulingConstraint extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String constraintType;

    protected SchedulingConstraint() {
    }

    private SchedulingConstraint(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.constraintType = builder.constraintType;
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

    public String getConstraintType() {
        return constraintType;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String constraintType;

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

        public Builder constraintType(String constraintType) {
            this.constraintType = constraintType;
            return this;
        }

        public SchedulingConstraint build() {
            return new SchedulingConstraint(this);
        }
    }
}
