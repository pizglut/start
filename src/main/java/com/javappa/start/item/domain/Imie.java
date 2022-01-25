package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "imies")
public class Imie {

    @Id
    @GeneratedValue
    private Long id;
    private String imie;

    public Imie() {
    }

    public Imie(String imie) {
        this.imie = imie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
}
