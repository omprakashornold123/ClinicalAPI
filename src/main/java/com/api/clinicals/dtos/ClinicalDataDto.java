package com.api.clinicals.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicalDataDto {

    private  String componentName;
    private String componentValue;
    private Timestamp measuredDateTime;
}
