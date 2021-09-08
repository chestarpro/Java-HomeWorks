package com.company.A;

import com.company.A.threads.ThreadAddition;
import com.company.A.threads.ThreadDivide;
import com.company.A.threads.ThreadMultiplication;
import com.company.A.threads.ThreadSubtraction;

public class Main {
    public static int totalVariable;

    public static void main(String[] args) {
        ThreadDivide divide = new ThreadDivide();
        ThreadAddition addition = new ThreadAddition();
        ThreadSubtraction subtraction = new ThreadSubtraction();
        ThreadMultiplication multiplication = new ThreadMultiplication();

        Main.totalVariable = 13;

        multiplication.start();
        divide.start();
        addition.start();
        subtraction.start();

        System.out.println(Main.totalVariable);
        // Мы не можем гарантировать, что ответ всегда будет одинаковым.
    }
}
