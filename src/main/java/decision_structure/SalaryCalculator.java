package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("Welcome to Salary Calculator");
        System.out.println();
        System.out.println("How many sales did employee get this week?");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();

        scanner.close();
        if (sales > quota){
            salary += bonus;
        }

        System.out.println(String.format("Salary: %s", salary));
    }
}
