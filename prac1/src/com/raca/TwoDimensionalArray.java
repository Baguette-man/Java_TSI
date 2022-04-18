package com.raca;

public class TwoDimensionalArray {
    public void readColumn(int[][] array){
        System.out.println("Print column??");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[0][j] + " ");
            }
            System.out.println();
        }
    }
}
