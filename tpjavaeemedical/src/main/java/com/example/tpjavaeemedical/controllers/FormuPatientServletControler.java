package com.example.tpjavaeemedical.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "PatientServletController", value = "/patient/formulaire")
public class FormPatientServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/formulaire-patient.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String name=   request.getParameter("nom");
         String prenom = request.getParameter("prenom");
         String telephone = request.getParameter("telephone");
         String dateNaissance = request.getParameter("dateNaissance");
         String adresse = request.getParameter("adresse");
         String sexe = request.getParameter("sexe");
         //verification des champs
        try {
            patientService.add(nom, prenom,telephone,adresse,nss,dateNaissance,sexe);
            response.sendRedirect("/");
        }catch (Exception ex ){}

        re
    }
    public void destroy(){

    }
}
