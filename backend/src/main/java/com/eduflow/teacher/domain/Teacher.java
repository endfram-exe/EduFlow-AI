package com.eduflow.teacher.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String employeeCode;

    @Column(nullable = false, length = 160)
    private String displayName;

    @Column(nullable = false, length = 160)
    private String email;

    protected Teacher() {
    }

    private Teacher(Builder builder) {
        this.employeeCode = builder.employeeCode;
        this.displayName = builder.displayName;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }

    public static final class Builder {
        private String employeeCode;
        private String displayName;
        private String email;

        private Builder() {
        }

        public Builder employeeCode(String employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}
