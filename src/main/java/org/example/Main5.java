package org.example;

//Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user.
// The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16.
// In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power).
// Note that the command returns a number of double types (i.e. floating point number).
// A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
// This assigns the value of 23 to the variable result.
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = s.nextInt();
        if(number<5){
            System.out.println("Number must be 5 or greater");
            return;
        }
        int sum = 0;
        for(int i=5;i<=number;i++){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("The sum of 2^5, 2^6, 2^7 ... 2^"+number+ " is "+sum);
    }
}
