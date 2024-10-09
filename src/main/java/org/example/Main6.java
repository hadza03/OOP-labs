package org.example;

//Create a method printText that prints the following string of characters:
// "In the beginning there were the swamp, the hoe and Java." and a line break.
// Users should be able to enter  how many times the text should be printed.

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter how many times you want to print the sentence : ");
        int number = s.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }

    }
}
