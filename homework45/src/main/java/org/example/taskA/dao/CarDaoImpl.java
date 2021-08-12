package org.example.taskA.dao;

import org.example.taskA.model.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CarDaoImpl extends BaseDao implements CarDao {
    @Override
    public Map<Long, Car> getAllCar() {
        String sql = "SELECT * FROM cars";

        HashMap<Long, Car> map = new HashMap<>();

        try (ResultSet rs = connect().prepareStatement(sql).executeQuery()){
            while (rs.next()) {
                Car car = new Car(
                        rs.getLong("id_car"),
                        rs.getString("car_number"),
                        rs.getString("model"),
                        rs.getFloat("engine_volume"),
                        rs.getDate("year_of_issue"),
                        rs.getString("color"));
                map.put(car.getId(), car);
            }
            return map;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
