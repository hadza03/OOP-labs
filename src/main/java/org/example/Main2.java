package org.example;

import java.util.Scanner;

//Create a program that asks the user for three numbers and then prints their sum.
public class Main2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = Integer.parseInt(s.nextLine());
        System.out.println("Enter second number : ");
        int n2 = Integer.parseInt(s.nextLine());
        System.out.println("Enter third number : ");
        int n3 = Integer.parseInt(s.nextLine());
        int sum = n1+n2+n3;
        System.out.println("Sum of your three numbers is : "+sum);
    }
}
