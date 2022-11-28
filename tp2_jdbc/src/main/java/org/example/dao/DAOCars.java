package org.example.dao;

import org.example.domain.Car;

import java.util.List;

public interface DAOCars {

    Integer create(Car car);

    List<Car> getAllCar();

    Car getCar(Integer id);

    int update(Car car);

    int delete(Car car );

}
