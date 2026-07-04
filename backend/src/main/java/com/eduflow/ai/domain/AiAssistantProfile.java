package com.eduflow.ai.domain;

import com.eduflow.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ai_assistant_profiles")
public class AiAssistantProfile extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String code;

    @Column(nullable = false, length = 160)
    private String name;

    @Column(nullable = false, length = 160)
    private String modelProvider;

    protected AiAssistantProfile() {
    }

    private AiAssistantProfile(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.modelProvider = builder.modelProvider;
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

    public String getModelProvider() {
        return modelProvider;
    }

    public static final class Builder {
        private String code;
        private String name;
        private String modelProvider;

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

        public Builder modelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }

        public AiAssistantProfile build() {
            return new AiAssistantProfile(this);
        }
    }
}
