package com.kodlama.io.Devs.entities.concrete;

import lombok.Data;

import javax.persistence.*;

@Entity
public class ProgrammingLanguages {

    public ProgrammingLanguages() {
    }

    public ProgrammingLanguages(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
