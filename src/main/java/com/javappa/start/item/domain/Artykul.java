package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "artykuls")

public class Artykul {

    @Id
    @GeneratedValue
    private Long id;
    private String artykul;

    public Artykul() {
    }

    public Artykul(String artykul) {
        this.artykul = artykul;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setArtykul(String artykul) {
        this.artykul = artykul;
    }

    public String getArtykul() {
        return artykul;
    }
}

