package org.example;
import java.util.Scanner;

public class D5P4 {

    public void reverseNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse:");
        int number = sc.nextInt();

        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed number is: " + reverse);
    }
}
