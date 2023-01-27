package com.example.tpspringbootangularmongodb.repository;

import com.example.tpspringbootangularmongodb.entity.Employe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository  extends MongoRepository<Employe,String> {
}
