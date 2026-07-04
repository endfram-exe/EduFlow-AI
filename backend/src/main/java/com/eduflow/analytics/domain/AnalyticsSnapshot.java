package com.eduflow.analytics.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "analytics_snapshots")
public class AnalyticsSnapshot extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String metricGroup;

    protected AnalyticsSnapshot() {
    }

    private AnalyticsSnapshot(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.metricGroup = builder.metricGroup;
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

    public String getMetricGroup() {
        return metricGroup;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String metricGroup;

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

        public Builder metricGroup(String metricGroup) {
            this.metricGroup = metricGroup;
            return this;
        }

        public AnalyticsSnapshot build() {
            return new AnalyticsSnapshot(this);
        }
    }
}
