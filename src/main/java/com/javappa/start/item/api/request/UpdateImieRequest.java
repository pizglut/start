package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateImieRequest extends ImieRequest{

    private final Long id;

    @JsonCreator
    public UpdateImieRequest(String imie, Long id) {
        super(imie);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}