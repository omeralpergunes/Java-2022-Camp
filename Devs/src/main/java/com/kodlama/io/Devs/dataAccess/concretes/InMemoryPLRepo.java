package com.kodlama.io.Devs.dataAccess.concretes;

import com.kodlama.io.Devs.dataAccess.abstracts.PLanguageRepo;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPLRepo implements PLanguageRepo {

    List<ProgrammingLanguages> programmingLanguages;

    public InMemoryPLRepo() {
        programmingLanguages = new ArrayList<ProgrammingLanguages>();
        programmingLanguages.add(new ProgrammingLanguages(1, "C#"));
        programmingLanguages.add(new ProgrammingLanguages(2, "Java"));
        programmingLanguages.add(new ProgrammingLanguages(3, "Python"));
        programmingLanguages.add(new ProgrammingLanguages(4, "C++"));
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguages getById(int id) {
        return programmingLanguages.get(id);
    }

    @Override
    public ProgrammingLanguages add(ProgrammingLanguages languages) throws Exception{
        programmingLanguages.add(languages);
        return languages;
    }

    @Override
    public ProgrammingLanguages update(int id) {
        return programmingLanguages.get(id);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id-1);
    }
}
