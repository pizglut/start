package com.javappa.start.item.api.response;

public class GodzinaResponse {

    private final Long id;
    private final String godzina;

    public GodzinaResponse(Long id, String godzina) {
        this.id = id;
        this.godzina = godzina;
    }

    public Long getId() {
        return id;
    }

    public String getGodzina() {
        return godzina;
    }
}

