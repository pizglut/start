package com.javappa.start.item.api.response;

public class ImieResponse {

    private final Long id;
    private final String imie;

    public ImieResponse(Long id, String imie) {
        this.id = id;
        this.imie = imie;
    }

    public Long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }
}
