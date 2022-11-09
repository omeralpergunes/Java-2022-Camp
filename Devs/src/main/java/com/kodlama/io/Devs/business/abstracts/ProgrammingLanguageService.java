package com.kodlama.io.Devs.business.abstracts;

import com.kodlama.io.Devs.business.requests.pLanguage.DeletePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.SavePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.UpdatePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.UpdateSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllPLanguagesResponseDto;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllPLanguagesResponseDto> getAll();
    ProgrammingLanguages getById(int id);
    void add(SavePLanguageRequestDto savePLanguageRequestDto) throws Exception;
    void update (UpdatePLanguageRequestDto updatePLanguageRequestDto,  int id) throws Exception;
    void delete(DeletePLanguageRequestDto deletePLanguageRequestDto, int id);
}
