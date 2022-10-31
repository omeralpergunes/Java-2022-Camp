package com.kodlama.io.Devs.business.abstracts;

import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageService {

    List<ProgrammingLanguages> getAll();

    boolean isBlank(ProgrammingLanguages programmingLanguages);
    boolean isExist(ProgrammingLanguages programmingLanguages);
    ProgrammingLanguages getById(int id);
    void add(ProgrammingLanguages programmingLanguages) throws Exception;
    void update (int id);
    void delete(ProgrammingLanguages programmingLanguages);
}
