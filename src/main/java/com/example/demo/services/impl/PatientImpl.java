package com.example.demo.services.impl;

import com.example.demo.Repo.PatientRepo;
import com.example.demo.actors.Patient;
import com.example.demo.services.PatientS;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientImpl implements PatientS {

   private PatientRepo patientRepo;

    public PatientImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }


    @Override
    public List<Patient> getPatients() {
        return patientRepo.findAll();
    }
}
