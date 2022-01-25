package com.javappa.start.item.api.response;

public class EmailResponse {

    private final Long id;
    private final String email;

    public EmailResponse(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

