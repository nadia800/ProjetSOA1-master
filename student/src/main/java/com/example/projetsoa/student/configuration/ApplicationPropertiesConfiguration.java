package com.example.projetsoa.student.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-config")
public class ApplicationPropertiesConfiguration {
    private int limitStudent;

    public int getLimitStudent() {
        return limitStudent;
    }

    public void setLimitStudent(int limitStudent) {
        this.limitStudent = limitStudent;
    }
}
