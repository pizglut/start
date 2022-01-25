package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ImieRequest {

    private final String imie;

    @JsonCreator
    public ImieRequest(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
}


