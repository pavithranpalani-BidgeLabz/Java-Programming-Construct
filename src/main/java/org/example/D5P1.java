package org.example;

import java.util.Scanner;

public  class D5P1{
    public  void fibonacci(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of fibonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

                    }
        System.out.println("day 5 problem 1 completed");

    }
}

