package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateArtykulRequest extends ArtykulRequest{

    private final Long id;

    @JsonCreator
    public UpdateArtykulRequest(String artykul, Long id) {
        super(artykul);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}