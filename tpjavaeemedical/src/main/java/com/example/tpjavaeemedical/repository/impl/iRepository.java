package com.example.tpjavaeemedical.repository.impl;

import com.example.tpjavaeemedical.entitites.Patient;

import java.util.List;

public class PatientRepository extends BaseRepository<Patient> {
    public  PatientRepository(){
        super();
    }
    @Override
    public boolean update(Patient element) {
        return false;
    }

    @Override
    public boolean delete(Patient element) {
        return false;
    }

    @Override
    public List<Patient> findAll() {
        return null;
    }

    @Override
    public Patient findById() {
        return null;
    }
}
