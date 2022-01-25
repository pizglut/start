package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "dataArtykylus")
public class DataArtykulu {

    @Id
    @GeneratedValue
    private Long id;
    private String dataArtykulu;

    public DataArtykulu() {
    }

    public DataArtykulu(String dataArtykulu) {
        this.dataArtykulu = dataArtykulu;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDataArtykulu(String dataArtykulu) {
        this.dataArtykulu = dataArtykulu;
    }

    public String getDataArtykulu() {
        return dataArtykulu;
    }
}
