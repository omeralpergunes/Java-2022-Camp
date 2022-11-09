package com.kodlama.io.Devs.business.concretes;

import com.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import com.kodlama.io.Devs.business.requests.subTechnologies.DeleteSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.SaveSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.UpdateSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllSubTechnologyResponseDto;
import com.kodlama.io.Devs.dataAccess.abstracts.PLanguageRepo;
import com.kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepo;
import com.kodlama.io.Devs.entities.concrete.ProgrammingLanguages;
import com.kodlama.io.Devs.entities.concrete.SubTechnology;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    @Autowired
    private SubTechnologyRepo subTechnologyRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PLanguageRepo pLanguageRepo;


    @Override
    public List<GetAllSubTechnologyResponseDto> getAll() {

       List<SubTechnology> subTechnologies = subTechnologyRepo.findAll();

        List<GetAllSubTechnologyResponseDto> getAllSubTechnologyResponseDtos = new ArrayList<GetAllSubTechnologyResponseDto>();

        for (SubTechnology subTechnology : subTechnologies) {
            GetAllSubTechnologyResponseDto getAllSubTechnologyResponseDto = modelMapper.map(subTechnology, GetAllSubTechnologyResponseDto.class);
            getAllSubTechnologyResponseDtos.add(getAllSubTechnologyResponseDto);
        }
        return getAllSubTechnologyResponseDtos;
    }

    @Override
    public void add(SaveSubTechnologyRequestDto saveSubTechnologyRequestDto) {
        SubTechnology subTechnology = modelMapper.map(saveSubTechnologyRequestDto, SubTechnology.class);
        subTechnology = subTechnologyRepo.save(subTechnology);

    }

    @Override
    public void update(UpdateSubTechnologyRequestDto updateSubTechnologyRequestDto, int id) {
        SubTechnology subTechnology = modelMapper.map(updateSubTechnologyRequestDto, SubTechnology.class);
        ProgrammingLanguages programmingLanguages = pLanguageRepo.getById(updateSubTechnologyRequestDto.getProgrammingLanguageId());
        subTechnology.setSubTechnologyName(programmingLanguages.getProgrammingLanguagesName());
        subTechnologyRepo.save(subTechnology);

        //this.subTechnologyRepo.update(id);
    }

    @Override
    public void delete(DeleteSubTechnologyRequestDto deleteSubTechnologyRequestDto, int id) {
        subTechnologyRepo.deleteById(deleteSubTechnologyRequestDto.getSubTechnologyId());
    }
}
