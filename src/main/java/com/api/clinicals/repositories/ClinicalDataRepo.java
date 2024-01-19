package com.api.clinicals.repositories;

import com.api.clinicals.enitites.ClinicalData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ClinicalDataRepo extends JpaRepository<ClinicalData, Serializable> {
}
