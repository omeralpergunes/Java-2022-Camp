package com.kodlama.io.Devs.business.concretes;

import com.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.Devs.dataAccess.abstracts.PLanguageRepo;
import com.kodlama.io.Devs.dataAccess.concretes.InMemoryPLRepo;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private PLanguageRepo pLanguageRepo;

    public ProgrammingLanguageManager(PLanguageRepo pLanguageRepo) {
        this.pLanguageRepo = pLanguageRepo;
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return pLanguageRepo.getAll();
    }
    @Override
    public ProgrammingLanguages getById(int id) {
        return this.pLanguageRepo.getById(id);
    }

    @Override
    public void add(ProgrammingLanguages programmingLanguages) throws Exception{
        if(isBlank(programmingLanguages) || isExist(programmingLanguages)){
            throw new Exception("Burayı boş bırakamazsınız");
        }
        else if(isExist(programmingLanguages)){
            throw new Exception("İstediğiniz dili ekleyin");
        }
        pLanguageRepo.add(programmingLanguages);
    }

    @Override
    public void update(int id) {
        pLanguageRepo.update(id);
    }

    @Override
    public void delete(ProgrammingLanguages programmingLanguages) {
        pLanguageRepo.delete(programmingLanguages.getId());
    }

    @Override
    public boolean isBlank(ProgrammingLanguages programmingLanguages) {
        if (programmingLanguages.getName().isEmpty() || programmingLanguages.getName().isBlank()){
            return true;
        }
        return false;
    }

    @Override
    public boolean isExist(ProgrammingLanguages programmingLanguages) {
        for (ProgrammingLanguages programmingLanguages1 : pLanguageRepo.getAll()){
            if(programmingLanguages1.getName().equalsIgnoreCase(programmingLanguages.getName())){
                return true;
            }
        }
        return false;
    }
}
