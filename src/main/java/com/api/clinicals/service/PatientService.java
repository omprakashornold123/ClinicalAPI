package com.api.clinicals.service;

import com.api.clinicals.dtos.PatientDto;
import com.api.clinicals.enitites.Patient;

import java.util.List;

public interface PatientService {

    List<PatientDto> getAllPatients();

    PatientDto getPatient(Integer id);
}
