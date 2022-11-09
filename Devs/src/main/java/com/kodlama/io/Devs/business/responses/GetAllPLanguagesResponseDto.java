package com.kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllPLanguagesResponseDto {

    private int programmingLanguageId;
    private String programmingLanguagesName;
}
