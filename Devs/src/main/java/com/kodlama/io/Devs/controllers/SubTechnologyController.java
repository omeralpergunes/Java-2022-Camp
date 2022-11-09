package com.kodlama.io.Devs.controllers;

import com.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import com.kodlama.io.Devs.business.requests.subTechnologies.DeleteSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.SaveSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.UpdateSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllSubTechnologyResponseDto;
import com.kodlama.io.Devs.entities.concrete.SubTechnology;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subTechnology")
public class SubTechnologyController {

    @Autowired
    private SubTechnologyService subTechnologyService;


    @GetMapping("/getAll")
    public List<GetAllSubTechnologyResponseDto> getAll(){
       List<GetAllSubTechnologyResponseDto> getAllSubTechnologyResponseDtos = subTechnologyService.getAll();
       return getAllSubTechnologyResponseDtos;
    }

    @PostMapping("/add")
    public void add(@RequestBody SaveSubTechnologyRequestDto saveSubTechnologyRequestDto){
         this.subTechnologyService.add(saveSubTechnologyRequestDto);

    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateSubTechnologyRequestDto updateSubTechnologyRequestDto, int id){
        this.subTechnologyService.update(updateSubTechnologyRequestDto, id);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(DeleteSubTechnologyRequestDto deleteSubTechnologyRequestDto, int id){
        this.subTechnologyService.delete(deleteSubTechnologyRequestDto, id);

    }
}
