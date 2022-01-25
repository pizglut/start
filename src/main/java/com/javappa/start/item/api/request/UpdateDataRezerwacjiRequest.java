package com.javappa.start.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;


public class UpdateDataRezerwacjiRequest extends DataRezerwacjiRequest{

    private final Long id;

    @JsonCreator
    public UpdateDataRezerwacjiRequest(String dataRezerwacji, Long id) {
        super(dataRezerwacji);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
