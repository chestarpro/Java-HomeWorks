package org.example.model;

import lombok.*;

@Data
public class TwoNumbersModel {
    private Integer num1;
    private Integer num2;

    public Integer getSum() {
        return num1 + num2;
    }
}
