package com.kodlama.io.Devs.dataAccess.abstracts;

import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PLanguageRepo extends JpaRepository<ProgrammingLanguages, Integer> {

}
