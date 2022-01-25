package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class TytulRequest {

    private final String tytul;

    @JsonCreator
    public TytulRequest(String tytul) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }
}
