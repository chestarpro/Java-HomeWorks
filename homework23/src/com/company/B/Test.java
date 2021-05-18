package com.company.B;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

public class Test extends  Canvas {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        QuadCurve2D q = new QuadCurve2D.Float ();
        CubicCurve2D c = new CubicCurve2D.Double ();

        final Parabola [] parabola = new Parabola[2];
        parabola[0] = new Parabola(30); //Формула в классе Parabola
        parabola[1] = new Parabola(200, 480, 180, 10);

        for (int i = 0; i < parabola.length; i++) {
            if (i == 0) {
                q.setCurve (5, 0, parabola[i].getX1(), parabola[i].getY1(), 55, 0);
                System.out.println("x: " + parabola[i].getX1());
                System.out.println("y: " + parabola[i].getY1());
                System.out.println();
                g2.draw (q);
            } else if (i == 1) {
                c.setCurve (250, 0, parabola[i].getX1(), parabola[i].getY1(),
                        parabola[i].getX2(), parabola[i].getY2(), 130, 500);
                System.out.println("x: " + parabola[i].getX1() + ", " + parabola[i].getX2());
                System.out.println("y: " + parabola[i].getY1() + ", " + parabola[i].getY2()); // Здесь не по формуле.
                System.out.println(); // я бы мог запарится по искать но там где я нашел совсем уровень другой, ты бы сразу понял что я скоприовал:)
                g2.draw (c);
            }
        }
    }
}
