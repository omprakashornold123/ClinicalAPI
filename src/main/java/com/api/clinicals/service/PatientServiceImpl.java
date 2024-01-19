package com.api.clinicals.service;

import com.api.clinicals.dtos.PatientDto;
import com.api.clinicals.enitites.Patient;
import com.api.clinicals.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public List<PatientDto> getAllPatients() {
        List<Patient> patients = patientRepo.findAll();
        List<PatientDto> patientDtos = patients.stream().map( patient -> PatientDto.builder().firstName( patient.getFirstName() ).
                lastName( patient.getLastName() ).age( patient.getAge() ).build() ).collect( Collectors.toList() );
        return patientDtos;
    }

    @Override
    public PatientDto getPatient(Integer id) {
        PatientDto patientDto = null;
        Optional<Patient> patientOptional = patientRepo.findById( id );
        if (patientOptional.isPresent()) {
            Patient patient = patientOptional.get();
            patientDto = PatientDto.builder().firstName( patient.getFirstName() ).lastName( patient.getLastName() ).age( patient.getAge() ).build();
        }
        return patientDto;
    }
}
