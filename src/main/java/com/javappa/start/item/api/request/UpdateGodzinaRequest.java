package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateGodzinaRequest extends GodzinaRequest{

    private final Long id;

    @JsonCreator
    public UpdateGodzinaRequest(String godzina, Long id) {
        super(godzina);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}