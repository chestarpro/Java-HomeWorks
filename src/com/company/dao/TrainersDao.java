package com.company.dao;

import com.company.model.Trainer;

import java.util.List;

public interface TrainersDao {
    List<Trainer> getAll();
    int getFinalSalary();
    List <String> getMolodec();
}
