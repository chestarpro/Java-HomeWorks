package com.company.dao;

import com.company.model.Group;

import java.util.List;

public interface GroupDao {
    List<Group> getAllGroup();
    void getCountStudents(String nameGroup);
}
