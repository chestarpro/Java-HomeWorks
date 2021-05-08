package com.company.B;

import java.util.Arrays;

public class Lessons extends Group {
    private String timeStart;
    private boolean isHomework;
    private boolean isExam;

    public Lessons() { }

    public Lessons(String dateStart, Student[] arrayStudent, Course course, String timeStart, boolean isHomework, boolean isExam) {
        super(dateStart, arrayStudent, course);
        this.timeStart = timeStart;
        this.isHomework = isHomework;
        this.isExam = isExam;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public boolean isHomework() {
        return isHomework;
    }

    public void setHomework(boolean homework) {
        isHomework = homework;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }

    public String printYesNo(boolean n) {
        if(!n) return "No";
        else return "Yes";
    }

    @Override
    public String removeBrackets(String str) {
        return str.substring(1, str.length() -1);
    }

    @Override
    public String toString() {
        return String.format("""
                        The date of the: %s\s
                        Attending students: %s\s
                        Course:
                        %s\s
                        Start time: %s\s
                        Was homework assigned?: %s\s
                        Was there an exam?: %s""",
                getDateStart(),
                removeBrackets(Arrays.toString(getArrayStudent())),
                getCourse(),
                this.timeStart,
                printYesNo(this.isHomework),
                printYesNo(this.isExam));
    }
}
