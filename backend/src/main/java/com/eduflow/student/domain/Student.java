package com.eduflow.student.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String admissionNumber;

    @Column(nullable = false, length = 160)
    private String displayName;

    @Column(nullable = false, length = 160)
    private String email;

    protected Student() {
    }

    private Student(Builder builder) {
        this.admissionNumber = builder.admissionNumber;
        this.displayName = builder.displayName;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }

    public static final class Builder {
        private String admissionNumber;
        private String displayName;
        private String email;

        private Builder() {
        }

        public Builder admissionNumber(String admissionNumber) {
            this.admissionNumber = admissionNumber;
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

        public Student build() {
            return new Student(this);
        }
    }
}
