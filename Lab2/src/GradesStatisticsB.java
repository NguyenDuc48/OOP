import java.util.Arrays;
import java.util.Scanner;

public class GradesStatisticsB {
    public static int[] grades;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        readGrades();
        System.out.println();
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + stdDev(grades));

    }

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        grades = new int[numStudents];
        int idx = 1;
        do {
            System.out.print("Enter the grade for student " + idx + ": ");
            int grade = in.nextInt();
            if (grade >= 0 && grade <= 100) {
                grades[idx - 1] = grade;
                idx++;
            } else {
                System.out.println("Ban da nhap sai, xin hay nhap lai !");
            }
        } while (idx <= grades.length);
    }

    public static void print(int[] array) {

        if (array.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.print("The grades are: [");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "]");
        }
        System.out.println();

    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return Math.round((sum * 100.0 / array.length)) / 100.0;
    }

    public static double median(int[] array) {
        Arrays.sort(array);

        if (array.length % 2 != 0) {
            return array[array.length / 2];
        } else {
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0;
        }
    }

    public static int max(int[] array) {
        int maxVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
            }
        }
        return maxVal;
    }

    public static int min(int[] array) {
        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minVal > array[i]) {
                minVal = array[i];
            }
        }
        return minVal;
    }

    public static double stdDev(int[] array) {
        double val = 0;
        double mean = average(array);
        for (int i = 0; i < array.length; i++) {
            val += (array[i] - mean) * (array[i] - mean);
        }
        double std = Math.sqrt(val / array.length);
        return Math.round(std * 100.0) / 100.0;
    }

}

