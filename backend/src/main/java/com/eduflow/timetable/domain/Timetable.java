package com.eduflow.timetable.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "timetables")
public class Timetable extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String academicYear;

    protected Timetable() {
    }

    private Timetable(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.academicYear = builder.academicYear;
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

    public String getAcademicYear() {
        return academicYear;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String academicYear;

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

        public Builder academicYear(String academicYear) {
            this.academicYear = academicYear;
            return this;
        }

        public Timetable build() {
            return new Timetable(this);
        }
    }
}
