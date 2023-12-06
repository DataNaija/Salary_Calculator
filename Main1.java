package salarycalculator;

public class Main1 {
    public static double salaryCalculator(double hoursPerWeek, double amountPerHour,
                                          int vacationDays){
        if (hoursPerWeek < 0){
            return  -1;
        }
        if (amountPerHour < 0){
            return  -1;
        }
        double unpaidTime = vacationDays * amountPerHour * 8;
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        return (weeklyPaycheck * 52) - unpaidTime;

    }

    public static void main(String[] args){
        double salary = salaryCalculator(40, 15, 8);
        System.out.println(salary);
    }
}
