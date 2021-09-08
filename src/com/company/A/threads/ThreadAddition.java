package com.company.A.threads;

import com.company.A.Main;

public class ThreadAddition extends Thread{
    @Override
    public void run() {
        Main.totalVariable = Main.totalVariable + 2;
        System.out.println("Addition = " + Main.totalVariable);
    }
}
