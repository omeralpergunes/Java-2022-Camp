package com.kodlama.io.Devs.entities.concrete;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "programming_languages")
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programming_language_id")
    private int programmingLanguageId;

    @Column
    private String programmingLanguagesName;

    @OneToMany(mappedBy = "programmingLanguages")
    private List<SubTechnology> subTechnologies;

}

