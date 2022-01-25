package com.javappa.start.item.api.response;

public class ArtykulResponse {

    private final Long id;
    private final String artykul;

    public ArtykulResponse(Long id, String artykul) {
        this.id = id;
        this.artykul = artykul;
    }

    public Long getId() {
        return id;
    }

    public String getArtykul() {
        return artykul;
    }
}
