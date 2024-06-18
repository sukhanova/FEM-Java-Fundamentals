package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to the Gross Pay Calculator");
        System.out.println();
        System.out.println("How many hours did you work?");

        // Scanner reads input from command line
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();

        scanner.close();

        double payRate = hours * rate;
        System.out.println(String.format("Gross pay: %s", payRate));
    }
}
