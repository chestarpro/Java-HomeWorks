package com.company.taskA;

import com.company.taskA.Factorial;
import com.company.taskA.RootDegree;

public class Main {

    public static void main(String[] args) {
        Factorial factorialLambda = numb -> {
            int factorial = 1;
            for (int i = 2; i <= numb; i++) {
                factorial *= i;
            }
            return factorial;
        };
        int numb = 7;
        System.out.println("!"+ numb + " = " + factorialLambda.getFactorial(numb));

        RootDegree rootDegreeLambda = (a, b) -> Math.pow(b, (1 / a));
        int a = 3;
        int b = 8;
        System.out.println(a + "√" + b + " = " + (int) rootDegreeLambda.getRootDegree(a, b));
    }
}
