package com.javappa.start.item.api.response;

public class DataArtykuluResponse {

    private final Long id;
    private final String dataArtykulu;

    public DataArtykuluResponse(Long id, String dataArtykulu) {
        this.id = id;
        this.dataArtykulu = dataArtykulu;
    }

    public Long getId() {
        return id;
    }

    public String getDataArtykulu() {
        return dataArtykulu;
    }
}

