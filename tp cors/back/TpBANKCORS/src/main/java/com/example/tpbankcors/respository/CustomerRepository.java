package com.example.tpbankcors.respository;

import com.example.tpbankcors.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {


    //methode de recherche
    @Query("select c from Customer c where c.name like :keyword")
    List<Customer> findByName(@Param("keyword") String keywords);

}

