package com.javappa.start.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "tytuls")
public class Tytul {

    @Id
    @GeneratedValue
    private Long id;
    private String tytul;

    public Tytul() {
    }

    public Tytul(String tytul) {
        this.tytul = tytul;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTytul(String name) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }
}

