package com.bwei.microservice;

import org.springframework.stereotype.Component;

/**
 * Created by 染熙 on 2017/7/24.
 */
@Component
public class User {
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
