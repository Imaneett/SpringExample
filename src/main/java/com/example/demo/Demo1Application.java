package com.example.demo;

import com.example.demo.Repo.PatientRepo;
import com.example.demo.actors.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {




    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
    private final PatientRepo patientRepo;
    public Demo1Application(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }
    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient("nickel","etienne","male","ii@gmail.com");
        patientRepo.save(patient);

    }
}
