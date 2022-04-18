package com.raca;
import java.util.Scanner;

public class Calculator {
    public void factorial() {
        System.out.println("Enter factorial to calculate:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = 1;
        for (int i = 1; i < n + 1; i++) {
            f = i * f;
        }
        System.out.println("The result of factorial is : " + f);
    }

    public void averageTot(int[][] array){
        double sum = 0;
        double avg;
        int n = array.length * array[0].length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        avg = sum/n;
        System.out.println("Average value is: " + avg);
    }

    public void averageCol(int [][] array){
        double sum = 0;
        double avg;
        int n = array[0].length;
        for (int j = 0; j < n; j++){
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            avg = sum/n;
            System.out.println("Average column " + j +  " value: " + avg);
            sum = 0;
        }
    }
}

