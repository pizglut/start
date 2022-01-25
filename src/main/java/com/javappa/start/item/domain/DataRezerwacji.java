package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "dataRezerwacjis")
public class DataRezerwacji {

    @Id
    @GeneratedValue
    private Long id;
    private String dataRezerwacji;

    public DataRezerwacji() {
    }

    public DataRezerwacji(String dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDataRezerwacji(String dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
    }

    public String getDataRezerwacji() {
        return dataRezerwacji;
    }
}
