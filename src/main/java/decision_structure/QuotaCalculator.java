package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to Quota Calculator");
        int quota = 10;

        System.out.println("Enter number of sales made: ");
        Scanner scanner = new Scanner(System.in);
         int sales = scanner.nextInt();
         scanner.close();
         int salesShort = quota - sales;
        String result = (sales >= quota) ? "Congratulation, you've made your quota":
                String.format("You did not make quota this week.\nYou are %s sales short", salesShort);
        System.out.println(result);
    }
}
