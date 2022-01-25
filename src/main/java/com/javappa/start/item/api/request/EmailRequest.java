package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class EmailRequest {

    private final String email;

    @JsonCreator
    public EmailRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}


