package com.example.correctiontodolist.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final  String pseudo="pseudo";
    private  final String  password= "password";

@Autowired
    private HttpSession _httpSession;


    public  boolean login(String pseudo,String password){
        if (pseudo.equals(pseudo)&& password.equals(password)){
            _httpSession.setAttribute("login","succes");
            return  true;
        }
        return  false;
    }



}
