package com.kodlama.io.Devs.controllers;

import com.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.kodlama.io.Devs.business.requests.pLanguage.DeletePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.SavePLanguageRequestDto;
import com.kodlama.io.Devs.business.requests.pLanguage.UpdatePLanguageRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllPLanguagesResponseDto;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private ProgrammingLanguageService programmingLanguageService;

    @GetMapping("/getAll")
    public List<GetAllPLanguagesResponseDto> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody SavePLanguageRequestDto savePLanguageRequestDto) throws Exception{
        this.programmingLanguageService.add(savePLanguageRequestDto);
    }

    @GetMapping("/getById/{id}")
    public ProgrammingLanguages getById(@PathVariable("id") int id){
        return programmingLanguageService.getById(id);
    }

    @PutMapping("/update/{id}")
    public void update(UpdatePLanguageRequestDto updatePLanguageRequestDto, int id) throws Exception{
        this.programmingLanguageService.update(updatePLanguageRequestDto, id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(DeletePLanguageRequestDto deletePLanguageRequestDto, int id){
            this.programmingLanguageService.delete(deletePLanguageRequestDto, id);
    }
}
