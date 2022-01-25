package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateDataArtykuluRequest extends DataArtykuluRequest{

    private final Long id;

    @JsonCreator
    public UpdateDataArtykuluRequest(String dataArtykulu, Long id) {
        super(dataArtykulu);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
