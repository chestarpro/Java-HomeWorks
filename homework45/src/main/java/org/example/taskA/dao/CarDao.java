package org.example.taskA.dao;

import org.example.taskA.model.Car;

import java.util.Map;

public interface CarDao {
    Map<Long, Car> getAllCar();
}
