package com.eduflow.section.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sections")
public class Section extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String capacity;

    protected Section() {
    }

    private Section(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.capacity = builder.capacity;
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

    public String getCapacity() {
        return capacity;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String capacity;

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

        public Builder capacity(String capacity) {
            this.capacity = capacity;
            return this;
        }

        public Section build() {
            return new Section(this);
        }
    }
}
