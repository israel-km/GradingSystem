package com.mycompany.gradingsummary;

import java.util.Scanner;

public class GradingSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] gradeCount = new int[10]; // index 1 to 9

        int student = 1;
        while (student <= 5) {
            System.out.print("\nEnter score for student " + student + ": ");
            int score = input.nextInt();
            int grade = 0;

            if (score >= 80 && score <= 100) grade = 1;
            else if (score >= 75) grade = 2;
            else if (score >= 66) grade = 3;
            else if (score >= 60) grade = 4;
            else if (score >= 50) grade = 5;
            else if (score >= 45) grade = 6;
            else if (score >= 35) grade = 7;
            else if (score >= 30) grade = 8;
            else grade = 9;

            gradeCount[grade]++; // increment count
            student++;
        }

        // Display summary
        System.out.println("\n--- GRADE SUMMARY ---");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + " Count: " + gradeCount[i]);
        }

        input.close();
    }
}
