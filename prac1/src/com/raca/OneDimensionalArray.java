package com.raca;

import java.util.Random;

public class OneDimensionalArray {
    public int[][] createRandomArray(int [] [] array){
        Random rand = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = rand.nextInt(100);
            }
        }
        return array;
    }

    public void readRandomArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void maxValueArray(int [][] array){
        int a;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                a = array [i][j];
                if (a > b){
                    b = a;
                }
            }
        }
        System.out.println("Max value is: " + b);
    }

    public void minValueArray(int [][] array){
        int a;
        int b = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                a = array [i][j];
                if (a < b){
                    b = a;
                }
            }
        }
        System.out.println("Min value is: " + b);
    }
}
