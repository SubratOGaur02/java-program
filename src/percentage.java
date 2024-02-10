package com.company;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);   // system.in --> read from the keyboard
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();
        System.out.println("Enter number 4: ");
        int d = sc.nextInt();
        System.out.println("Enter number 5: ");
        int e = sc.nextInt();
        float percentage = ( a + b + c + d + e )/ 5;
        System.out.println(percentage+"%");
    }
}