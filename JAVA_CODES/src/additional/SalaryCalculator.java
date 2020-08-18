/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 18-08-2020
 * Time: 10:15 AM
 * File: SalaryCalculator.java
 * */

/*
 * Input 1: number of hours the employee works per week
 * Input 2: amount of money the employee makes per hour
 * Output: employee's gross yearly salary
 * Bonus: can you add an input that accounts for vacation?
 * The employee does not get paid for vacation days
 * One vacation day = eight hours of work
 * */

package additional;

public class SalaryCalculator {
    public static double calculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (amountPerHour < 0) {
            return -1;
        }
        double weeklyIncome = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyIncome * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        double salary = calculator(40, 15, 8);
        System.out.println(salary);
    }
}
