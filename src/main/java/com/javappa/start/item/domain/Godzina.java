package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "godzinas")
public class Godzina {

    @Id
    @GeneratedValue
    private Long id;
    private String godzina;

    public Godzina() {
    }

    public Godzina(String godzina) {
        this.godzina = godzina;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getGodzina() {
        return godzina;
    }
}
