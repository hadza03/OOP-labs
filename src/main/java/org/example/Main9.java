package org.example;
//Modify the previously created starts piramid in a way that now you are
// not printing the stars but in each row numbers from 1 to the current row count.
public class Main9 {
    public static void main(String[] args){
        drawPiramid(5);

    }
    public static void drawPiramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
