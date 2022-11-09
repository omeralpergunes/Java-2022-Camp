package com.kodlama.io.Devs.business.requests.subTechnologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequestDto {

    private int programmingLanguageId;

    private String subTechnologyName;
}