package com.kodlama.io.Devs.controllers;

import com.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
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
    public List<ProgrammingLanguages> getAll(){
        return this.programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public ProgrammingLanguages add(@RequestBody ProgrammingLanguages programmingLanguages) throws Exception{
        programmingLanguageService.add(programmingLanguages);
        return programmingLanguages;
    }

    @GetMapping("/getById/{id}")
    public ProgrammingLanguages getById(@PathVariable("id") int id){
        return programmingLanguageService.getById(id);
    }

    @PutMapping("/update/{id}")
    public ProgrammingLanguages update(@PathVariable("id") int id,@RequestBody ProgrammingLanguages programmingLanguages){
        programmingLanguageService.update(id);
        return programmingLanguages;
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") ProgrammingLanguages programmingLanguages){
            programmingLanguageService.delete(programmingLanguages);
    }
}
