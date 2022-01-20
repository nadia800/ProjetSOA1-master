package com.example.projetsoa.administration.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-config")
public class ApplicationPropertiesConfiguration {
    private int limitAdministration;

    public int getLimitAdministration() {
        return limitAdministration;
    }

    public void setLimitAdministration(int limitAdministration) {
        this.limitAdministration = limitAdministration;
    }
}
