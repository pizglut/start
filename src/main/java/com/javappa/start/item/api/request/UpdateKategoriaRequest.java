package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;


public class UpdateKategoriaRequest extends KategoriaRequest {

    private final Long id;

    @JsonCreator
    public UpdateKategoriaRequest(String kategoria, Long id) {
        super(kategoria);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}