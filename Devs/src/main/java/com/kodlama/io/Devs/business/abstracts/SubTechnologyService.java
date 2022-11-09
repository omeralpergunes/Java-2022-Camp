package com.kodlama.io.Devs.business.abstracts;

import com.kodlama.io.Devs.business.requests.subTechnologies.DeleteSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.SaveSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.requests.subTechnologies.UpdateSubTechnologyRequestDto;
import com.kodlama.io.Devs.business.responses.GetAllSubTechnologyResponseDto;
import com.kodlama.io.Devs.entities.concrete.SubTechnology;

import java.util.List;

public interface SubTechnologyService {

    List<GetAllSubTechnologyResponseDto> getAll();
    void add(SaveSubTechnologyRequestDto saveSubTechnologyRequestDto);
    void update (UpdateSubTechnologyRequestDto subTechnologyRequestDto, int id);
    void delete(DeleteSubTechnologyRequestDto deleteSubTechnologyRequestDto, int id);
}
