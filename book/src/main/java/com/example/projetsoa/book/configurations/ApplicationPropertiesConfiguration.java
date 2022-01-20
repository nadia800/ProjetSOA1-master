package com.example.projetsoa.book.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-config")
public class ApplicationPropertiesConfiguration {

    private int limitDeBook;

    public int getLimitDeBook() {
        return limitDeBook;
    }

    public void setLimitDeBook(int limitDeBook) {
        this.limitDeBook = limitDeBook;
    }
}
