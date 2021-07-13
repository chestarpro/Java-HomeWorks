package com.company;

import com.company.dao.GroupDao;
import com.company.dao.impl.GroupDaoImpl;

public class TestB {
    public static void main(String[] args) {
        GroupDao groupDao = new GroupDaoImpl();

        String javaGroupName = "JV-W21";
        String pythonGroupName = "PY-W21";

        groupDao.getCountStudents(javaGroupName);
        groupDao.getCountStudents(pythonGroupName);

        System.out.println("Список всех гупп: ");
        for (int i = 0; i < groupDao.getAllGroup().size(); i++) {
            System.out.println(groupDao.getAllGroup().get(i));
        }
    }
}
