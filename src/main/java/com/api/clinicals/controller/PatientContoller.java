package com.api.clinicals.controller;

import com.api.clinicals.dtos.PatientDto;
import com.api.clinicals.enitites.Patient;
import com.api.clinicals.repositories.PatientRepo;
import com.api.clinicals.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/patient")
public class PatientContoller {

    @Autowired
    private PatientService patientService;


    @GetMapping("/welcome")
    public String test(){
        return "working";
    }

    @GetMapping("/")
    public ResponseEntity<List<PatientDto>> getAllPatient(){
        List<PatientDto> patients=patientService.getAllPatients();
        return new ResponseEntity<>( patients, HttpStatus.OK );
    }





}
