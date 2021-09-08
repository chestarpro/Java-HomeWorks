package com.company.A.threads;

import com.company.A.Main;

public class ThreadDivide extends Thread{
    @Override
    public void run() {
        Main.totalVariable = Main.totalVariable / 2;
        System.out.println("Divide = " + Main.totalVariable);
    }
}
