package loops;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i = 0; i < numberOfStudents; i++){
            double total = 0;

            //Process student's tests
            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Score for Test #: "+ (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total/numberOfTests;
            System.out.println(String.format("The test average for student # %s is %s", (i+1), average));
        }

        scanner.close();
    }
}
