package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class GodzinaRequest {

    private final String godzina;

    @JsonCreator
    public GodzinaRequest(String godzina) {
        this.godzina = godzina;
    }

    public String getGodzina() {
        return godzina;
    }
}


