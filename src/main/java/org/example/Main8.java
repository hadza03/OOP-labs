package org.example;

//Write a program to print the inverted half pyramid shape as shown in the image below?
public class Main8 {
    public static void main(String[] args){
        for(int i=10;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
