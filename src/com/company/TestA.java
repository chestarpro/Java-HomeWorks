package com.company;

import com.company.dao.TrainersDao;
import com.company.dao.impl.TrainersDaoImpl;

public class TestA {
    public static void main(String[] args) {
        TrainersDao trainersDao = new TrainersDaoImpl();

        System.out.println("Список всех тренеров и их заработных плат: ");

        int finalSalary = 0;

        for (int i = 0; i < trainersDao.getAll().size(); i++) {
            System.out.println(trainersDao.getAll().get(i));
            finalSalary += trainersDao.getAll().get(i).getSalary();
        }

        System.out.println("\nИтоговая заработная плата по всем птренерам " + finalSalary + " сом\n");

        for (int i = 0; i < trainersDao.getAll().size(); i++) {
            if(trainersDao.getAll().get(i).getSurname().length() > 3)
                System.out.println(trainersDao.getAll().get(i).getSurname() + " мАлАдесс");
        }
    }
}
