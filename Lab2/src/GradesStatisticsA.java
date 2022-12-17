import java.util.Scanner;

public class GradesStatisticsA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numStudents = in.nextInt();
        int[] students = new int[numStudents];
        for (int i = 1; i <= students.length; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = in.nextInt();
            students[i - 1] = grade;
        }
        int sum = 0;

        int minimum = 100;
        int maximum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
            if (minimum > students[i]) {
                minimum = students[i];
            }
            if (maximum < students[i]) {
                maximum = students[i];
            }
        }
        double average = (double) sum / students.length;
        System.out.println("The average is: " + Math.round(average * 100) / 100.0);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }
}
