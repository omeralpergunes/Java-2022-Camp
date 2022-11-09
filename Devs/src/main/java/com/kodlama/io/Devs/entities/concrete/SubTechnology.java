package com.kodlama.io.Devs.entities.concrete;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sub_technology")
public class SubTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subtechnology_id")
    private int subTechnologyId;

    @Column
    private String subTechnologyName;

    @ManyToOne
    @JoinColumn(name = "programming_language_id")
    private ProgrammingLanguages programmingLanguages;
}
