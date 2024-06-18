package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message = switch (grade.toUpperCase()){
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            //when you need to execute multiple statements.
            case "C" -> {
                System.out.println("print");
                yield "You need to work a bit harder";  //last line must yield
            }
            //match multiple cases
            case "F", "D" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };
        System.out.println(message);
    }
}
