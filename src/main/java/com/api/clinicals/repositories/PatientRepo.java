package com.api.clinicals.repositories;

import com.api.clinicals.enitites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PatientRepo extends JpaRepository<Patient, Serializable> {
}
