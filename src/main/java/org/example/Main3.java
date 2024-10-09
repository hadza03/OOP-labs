package org.example;

import java.io.SequenceInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

//Create a program that reads numbers from the user and prints their sum.
//The program should stop asking for numbers when the user enters the number 0.
public class Main3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while(true){

            System.out.println("Enter numbers : ");
            int number = Integer.parseInt(s.nextLine());
            sum+=number;

            if(number==0){
                System.out.println("Sum of numbers is : "+sum);
                break;
            }

        }
    }
}
