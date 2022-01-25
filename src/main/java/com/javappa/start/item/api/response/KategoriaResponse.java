package com.javappa.start.item.api.response;

public class KategoriaResponse {

    private final Long id;
    private final String kategoria;

    public KategoriaResponse(Long id, String kategoria) {
        this.id = id;
        this.kategoria = kategoria;
    }

    public Long getId() {
        return id;
    }

    public String getKategoria() {
        return kategoria;
    }
}

