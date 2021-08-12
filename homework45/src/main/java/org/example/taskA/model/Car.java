package org.example.taskA.model;

import org.example.taskA.dao.BaseDao;

import java.sql.Date;

public class Car extends BaseDao {
    private Long id;
    private String carNumber;
    private String model;
    private Float engineVolume;
    private Date yearOfIssue;
    private String color;

    public Car() {}

    public Car(Long id, String carNumber, String model, Float engineVolume, Date yearOfIssue, String color) {
        this.id = id;
        this.carNumber = carNumber;
        this.model = model;
        this.engineVolume = engineVolume;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Date getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Date yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Car - ID: %s | Number: %s | Model: %s | Engine: volume %s | Year of issue: %s | Color: %s",
                this.id, this.carNumber, this.model, this.engineVolume, this.yearOfIssue, this.color);
    }
}
