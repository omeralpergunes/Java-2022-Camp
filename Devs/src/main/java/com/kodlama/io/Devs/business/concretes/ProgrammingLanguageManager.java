package com.kodlama.io.Devs.business.concretes;

import com.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.Devs.business.requests.pLanguage.DeletePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.SavePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.UpdatePLanguageRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllPLanguagesResponseDto;
import com.kodlama.io.Devs.dataAccess.abstracts.PLanguageRepo;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private PLanguageRepo pLanguageRepo;
    private ModelMapper modelMapper;

    public ProgrammingLanguageManager(PLanguageRepo pLanguageRepo) {
        this.pLanguageRepo = pLanguageRepo;
    }

    @Override
    public List<GetAllPLanguagesResponseDto> getAll() {
        List<ProgrammingLanguages> programmingLanguages = pLanguageRepo.findAll();

        List<GetAllPLanguagesResponseDto> getAllPLanguagesResponseDtos = new ArrayList<GetAllPLanguagesResponseDto>();

        for (ProgrammingLanguages programmingLanguages1 : programmingLanguages) {
            GetAllPLanguagesResponseDto getAllPLanguagesResponseDto = modelMapper.map(programmingLanguages, GetAllPLanguagesResponseDto.class);
            getAllPLanguagesResponseDtos.add(getAllPLanguagesResponseDto);
        }
        return getAllPLanguagesResponseDtos;
    }
    @Override
    public ProgrammingLanguages getById(int id)  {
        return this.pLanguageRepo.getById(id);
    }

    @Override
    public void add(SavePLanguageRequestDto savePLanguageRequestDto) throws Exception{
        ProgrammingLanguages programmingLanguage = new ProgrammingLanguages();

        for (ProgrammingLanguages pLanguage : this.pLanguageRepo.findAll()) {
            if (savePLanguageRequestDto.getProgrammingLanguagesName().equals(pLanguage.getProgrammingLanguagesName())) {
                throw new Exception("Program ismi mevcut!");
            } else if (savePLanguageRequestDto.getProgrammingLanguagesName() == null) {
                throw new Exception("Program ismi boş bırakılamaz!");
            } else {
                programmingLanguage.setProgrammingLanguagesName(savePLanguageRequestDto.getProgrammingLanguagesName());
                pLanguageRepo.save(programmingLanguage);
            }
        }
    }

    @Override
    public void update(UpdatePLanguageRequestDto updatePLanguageRequestDto, int id) throws Exception{
        ProgrammingLanguages programmingLanguages = pLanguageRepo.getById(id);
        programmingLanguages.setProgrammingLanguagesName(updatePLanguageRequestDto.getProgrammingLanguagesName());
        for (ProgrammingLanguages programmingLanguage : this.pLanguageRepo.findAll()) {
            if (updatePLanguageRequestDto.getProgrammingLanguagesName().equals(programmingLanguage.getProgrammingLanguagesName())) {
                throw new Exception("Program ismi mevcut!");
            } else if (updatePLanguageRequestDto.getProgrammingLanguagesName() == null) {
                throw new Exception("Program ismi boş bırakılamaz!");
            } else {
                pLanguageRepo.save(programmingLanguage);
            }
        }
    }

    @Override
    public void delete(DeletePLanguageRequestDto deletePLanguageRequestDto, int id) {
        pLanguageRepo.deleteById(deletePLanguageRequestDto.getProgrammingLanguageId());
    }

}
