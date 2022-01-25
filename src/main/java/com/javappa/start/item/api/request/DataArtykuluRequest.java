package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DataArtykuluRequest {

    private final String dataArtykul;

    @JsonCreator
    public DataArtykuluRequest(String dataArtykul) {
        this.dataArtykul = dataArtykul;
    }

    public String getDataArtykulu() {
        return dataArtykul;
    }
}
