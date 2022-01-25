package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateTytulRequest extends TytulRequest{

    private final Long id;

    @JsonCreator
    public UpdateTytulRequest(String tytul, Long id) {
        super(tytul);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
