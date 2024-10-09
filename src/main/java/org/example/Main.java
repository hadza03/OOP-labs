package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.printf("Enter password : ");
            String password = s.nextLine();
            if(password.equals("almir123")){
                System.out.println("Right ! Secret is : "+password);
                break;
            }


        }


    }
}