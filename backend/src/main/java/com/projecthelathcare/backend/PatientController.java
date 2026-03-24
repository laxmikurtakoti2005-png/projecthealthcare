package com.projecthelathcare.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    // Temporary storage (no database needed)
    private final List<String> patients = new ArrayList<>();

    // Add patient
    @GetMapping("/add")
    public String addPatient(@RequestParam String name) {
        patients.add(name);
        return "Patient added: " + name;
    }

    // Get all patients
    @GetMapping
    public List<String> getPatients() {
        return patients;
    }

    // Simple health check
    @GetMapping("/status")
    public String status() {
        return "Healthcare system is running ✅";
    }
}