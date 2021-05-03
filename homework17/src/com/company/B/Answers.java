package com.company.B;

public class Answers {
    String whatIsConstructors = "Конструктор - это специальный метод, который вызывается при создании нового объекта";
    String whatIsDefaultConstructors = "Дефолтный конструктор не иммет параметров, если его не создавать то он создается автоматически";
    String howDoesTheConstructorWork = "Ничего не возваращает, даже void";
    String whatIsConstructorFor = "Конструктор нужен для автоматической инициализации переменных";
    String whichConsIsCalWhenThereAreMultCons = "Тот который принимает такую же логику который мы вводим";
    String whatIsThis = "Ссылка на текущий объект в классе";

    public void printAnswers() {
        System.out.println(
                "1) " + whatIsConstructors + "\n" +
                "2) " + whatIsDefaultConstructors + "\n" +
                "3) " + howDoesTheConstructorWork + "\n" +
                "4) " + whatIsConstructorFor + "\n" +
                "5) " + whichConsIsCalWhenThereAreMultCons + "\n" +
                "6) " + whatIsThis);
    }
}
