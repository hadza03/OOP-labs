package org.example;

import java.util.Scanner;

//Create a program that asks the user for the first number and the last number and
//then prints all numbers between those two. Use a while loop.
public class Main4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = Integer.parseInt(s.nextLine());
        System.out.println("Enter second number : ");
        int number2 = Integer.parseInt(s.nextLine());
        int i = number1+1;
        while(i<number2){
            System.out.println(i);
            i++;
        }
    }
}
