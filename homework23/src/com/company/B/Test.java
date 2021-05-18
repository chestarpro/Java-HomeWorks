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
        parabola[0] = new Parabola(30);
        parabola[1] = new Parabola(200, 480, 180, 10);


        for (int i = 0; i < parabola.length; i++) {
            if (i == 0) {
                q.setCurve (5, 0, parabola[i].getX1(), parabola[i].getY1(), 55, 0);
                System.out.println("x: " + parabola[i].getX1());
                System.out.println("y: " + parabola[i].getY1());
                g2.draw (q);
            } else  c.setCurve (250, 0, parabola[i].getX1(), parabola[i].getY1(), parabola[i].getX2(), parabola[i].getY2(), 130, 500);
            System.out.println("x: " + parabola[i].getX1() + ", " + parabola[i].getX2());
            System.out.println("y: " + parabola[i].getY1() + ", " + parabola[i].getY2());
            g2.draw (c);
        }
    }
}
