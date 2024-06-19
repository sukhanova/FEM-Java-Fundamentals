package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static double requiredSalary = 45000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCredirScore();
        scanner.close();
        System.out.println(String.format("Salary is %s and score is %s",
                salary, creditScore));

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);

    }

    public static double getSalary(){
        System.out.println("Enter your salary ");
        double inputSalary = scanner.nextDouble();
        return inputSalary;
    }

    public static int getCredirScore(){
        System.out.println("Enter your credit score ");
        int inputScore = scanner.nextInt();
        return inputScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
//        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
//            return true;
//        }
//        return false;
        return (salary >= requiredSalary && creditScore >= requiredCreditScore);
    }

    public static void notifyUser(boolean qualified){
        if(qualified) System.out.println("Congrats, you've been approved");
        else System.out.println("Sorry, you've been declined");
    }
}
