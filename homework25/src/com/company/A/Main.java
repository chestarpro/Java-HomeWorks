package com.company.A;

import com.company.A.bread.Baguette;
import com.company.A.bread.Bake;
import com.company.A.circle.Circle;
import com.company.A.circle.PaintCircle;

public class Main {

    public static void main(String[] args) {
        Bake bakedBaguette = new Baguette("Baguette", 120.0, "Wheat flour", 30.50, 40);
        bakedBaguette.baked();

        PaintCircle circle = new Circle(10);
        circle.paintCircle();
    }
}
