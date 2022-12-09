package com.example.tpjavaeemedical.services;

import com.example.tpjavaeemedical.entitites.Patient;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private static List<Patient> patients = new ArrayList<>();

    private List<Patient>getPatients(){return patients;}

}