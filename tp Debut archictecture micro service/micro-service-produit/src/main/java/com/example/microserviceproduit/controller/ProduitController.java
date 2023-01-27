package com.example.microserviceproduit.controller;

import com.example.microserviceproduit.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("api/prduit")
public class ProduitController {

    @Autowired
    private

    @PostMapping("")
    ResponseEntity<Produit>post (@RequestBody Produit produit){
        return ResponseEntity.ok(Produit.builder().name());
    }
}
