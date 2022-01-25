package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ArtykulRequest {

    private final String artykul;

    @JsonCreator
    public ArtykulRequest(String artykul) {
        this.artykul = artykul;
    }

    public String getArtykul() {
        return artykul;
    }
}


