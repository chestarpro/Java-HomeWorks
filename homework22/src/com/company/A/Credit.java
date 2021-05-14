package com.company.A;

public class Credit {
    private String id;
    private double sum;
    private int period;
    private double percent;

    private static int countCredit;
    private static double totalSumCredits;

    public Credit(String id, double sum, int period, double percent) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.percent = percent;
        countCredit++;
        totalSumCredits += sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public static int getCountCredit() {
        return countCredit;
    }

    public static double getTotalSumCredits() {
        return totalSumCredits;
    }

    public static double getAverageSumCredits(){
        return totalSumCredits / countCredit;
    }

    @Override
    public String toString() {
        return String.format("Credit %s: id = %s, sum = %s som, period = %s, percent = %s%%",
                countCredit, this.id, this.sum,
                this.period > 1 ?
                        getPeriod() + " months"
                        :
                        getPeriod() + " month",
                this.percent);
    }
}
