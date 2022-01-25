package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "kategorias")
public class Kategoria {

    @Id
    @GeneratedValue
    private Long id;
    private String kategoria;

    public Kategoria() {
    }

    public Kategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getKategoria() {
        return kategoria;
    }
}
