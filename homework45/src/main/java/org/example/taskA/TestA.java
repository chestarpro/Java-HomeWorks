package org.example.taskA;

import org.example.taskA.dao.CarDaoImpl;
import org.example.taskA.model.Car;
import java.util.Map;

public class TestA {
    public static void main(String[] args) {

        Map<Long, Car> allCar = new CarDaoImpl().getAllCar();

        for (Map.Entry<Long, Car> entry : allCar.entrySet()) {
            System.out.println(entry);
        }

    }
}
