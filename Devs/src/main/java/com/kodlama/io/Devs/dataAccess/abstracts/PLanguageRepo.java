package com.kodlama.io.Devs.dataAccess.abstracts;

import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PLanguageRepo {
        List<ProgrammingLanguages> getAll();
        ProgrammingLanguages getById(int id);
        ProgrammingLanguages add (ProgrammingLanguages programmingLanguages) throws Exception;
        ProgrammingLanguages update (int id);
        void delete (int id);


}
