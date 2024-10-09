package org.example;

//Create a method called drawStarsPiramid that will accept the number of
// rows as a parameter and print a half pyramid shape where the number of
// rows will be dictated by the sent parameter.

public class Main7  {
    public static void main(String[] args){
        drawStarsPiramid(5);

    }
    public static void drawStarsPiramid(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
