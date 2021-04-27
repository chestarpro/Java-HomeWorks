package com.company;

public class Main {

    public static void main(String[] args) {
        Student[]student = new Student[3];

        student[0] = new Student();
        student[0].fullName = "Чынгыз Шералы уулу";
        student[0].dateBirth = "14.01.1993";
        student[0].resAdress = "г. Бишкек, мкр. Асанбай, дом 3";
        student[0].gender = "Мужской";
        student[0].university = "МАУПФиБ";
        student[0].univerAdress = "Жопа мира!";
        student[0].faculty = "'Комплекс Технических Средств'";
        student[0].group = "1";
        student[0].course = 1;
        student[0].hobby = "Powerlifting";

        student[1] = new Student();
        student[1].fullName = "Стивен Пол Джобс";
        student[1].dateBirth = "24.02.1955";
        student[1].resAdress = "2066 Crist Drive, Лос-Альтос, штат Калифорния";
        student[1].gender = "Мужской";
        student[1].university = "'Рид-колледж'";
        student[1].univerAdress = "г. Портленд, штат Орегон, США";
        student[1].faculty = "Предпринимательства"; // Хотя хз на кого он учился в этом колледже.
        student[1].group = "1";
        student[1].course = 2;
        student[1].hobby = "Губная гармошка";

        student[2] = new Student();
        student[2].fullName = "Спанч Боб Квадратные Штаны";
        student[2].dateBirth = "14.07.1986";
        student[2].resAdress = "г. Бикини-Боттом, 124 Конч Стрит";
        student[2].gender = "Мужской";
        student[2].university = "Институт кулинарии";
        student[2].univerAdress = "г. Бикини-Боттом";
        student[2].faculty = "Инженер Крабсбургеров";
        student[2].group = "1";
        student[2].course = 3;
        student[2].hobby = "Ловля медуз";

        for (Student students : student) {
            System.out.println("-----------------------\n" +
                                        "ФИО: " + students.fullName +
                                        "\nДата рождения: " + students.dateBirth +
                                        "\nПол: " + students.gender +
                                        "\nАдрес проживания: " + students.resAdress +
                                        "\nУниверситет: " + students.university +
                                        "\nАдрес университета: " + students.univerAdress +
                                        "\nФакультет: " + students.faculty +
                                        "\nГруппа: " + students.group +
                                        "\nКурс: " + students.course +
                                        "\nХобби: " + students.hobby);
        }
    }
}
