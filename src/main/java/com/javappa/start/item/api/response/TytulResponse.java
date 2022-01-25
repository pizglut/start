package com.javappa.start.item.api.response;

public class TytulResponse {

    private final Long id;
    private final String tytul;

    public TytulResponse(Long id, String tytul) {
        this.id = id;
        this.tytul = tytul;
    }

    public Long getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }
}

