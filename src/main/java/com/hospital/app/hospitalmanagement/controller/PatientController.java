package com.hospital.app.hospitalmanagement.controller;

import com.hospital.app.hospitalmanagement.entity.Patient;
import com.hospital.app.hospitalmanagement.repository.PatientRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    private final PatientRepo patientRepo;

    public PatientController(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<Patient> getName(@PathVariable Long id) {
        Patient patient = patientRepo.findById(id).get();
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/api/patient/create/")
    public ResponseEntity<Patient> create(@RequestBody Patient patient) {
        patientRepo.save(patient);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

}
