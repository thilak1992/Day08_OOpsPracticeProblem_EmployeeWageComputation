/* Calculate Daily Employee Wage with an assumption
    Wage/hr = 20; FullDay = 8hrs;
*/

import java.util.Random;

public class UC2 {
    static final int IS_FULL_TIME = 1;
    static final int EMP_WAGE_PER_DAY = 20;

    public static int empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(2);
        return empCheck;
    }

    public static void empSalary(int empCheck) {
        int empWrkHrs = 0;
        if (empCheck == IS_FULL_TIME) {
            empWrkHrs = 8;
        } else {
            empWrkHrs = 0;
        }
        int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
        System.out.println("Daily Employee Wage: " + empWage);
    }
    public static void main(String[] args) {
        int empCheck = UC2.empCheck();
        UC2.empSalary(empCheck);
    }

}
