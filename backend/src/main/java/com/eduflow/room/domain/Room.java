package com.eduflow.room.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String building;

    protected Room() {
    }

    private Room(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.building = builder.building;
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

    public String getBuilding() {
        return building;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String building;

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

        public Builder building(String building) {
            this.building = building;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}
