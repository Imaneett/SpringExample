package com.example.demo.Controller;
import com.example.demo.services.PatientS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PatientController  {
   public PatientS patientS;

    public PatientController(PatientS patientS) {
        this.patientS = patientS;
    }

    //handler
   @GetMapping("/patients")
    public String handlerPatient(Model m){

        m.addAttribute("Patient",patientS.getPatients());
        return "patients";
   }



}
