package com.example.demo_spring_security.repository;

import com.example.demo_spring_security.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact,String> {
}
