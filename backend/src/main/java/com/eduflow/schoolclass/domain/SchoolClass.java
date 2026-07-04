package com.eduflow.schoolclass.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "school_classes")
public class SchoolClass extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String gradeBand;

    protected SchoolClass() {
    }

    private SchoolClass(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.gradeBand = builder.gradeBand;
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

    public String getGradeBand() {
        return gradeBand;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String gradeBand;

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

        public Builder gradeBand(String gradeBand) {
            this.gradeBand = gradeBand;
            return this;
        }

        public SchoolClass build() {
            return new SchoolClass(this);
        }
    }
}
