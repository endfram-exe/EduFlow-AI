package com.eduflow.notification.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "notification_templates")
public class NotificationTemplate extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String channel;

    protected NotificationTemplate() {
    }

    private NotificationTemplate(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.channel = builder.channel;
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

    public String getChannel() {
        return channel;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String channel;

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

        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public NotificationTemplate build() {
            return new NotificationTemplate(this);
        }
    }
}
