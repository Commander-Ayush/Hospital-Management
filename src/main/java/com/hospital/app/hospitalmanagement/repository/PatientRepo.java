package com.hospital.app.hospitalmanagement.repository;


import com.hospital.app.hospitalmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {

}
