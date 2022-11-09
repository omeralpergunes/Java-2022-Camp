package com.kodlama.io.Devs.dataAccess.abstracts;

import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import com.kodlama.io.Devs.entities.concrete.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubTechnologyRepo extends JpaRepository<SubTechnology, Integer> {


}
