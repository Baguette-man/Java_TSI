package com.raca;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner yesno = new Scanner(System.in);
        do{
            System.out.println("Choose Ex[1], [2], [3], [4], [5], [6&7]");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("It is not working");
                    GravityCalculator gravityCalculator = new GravityCalculator();
                    //gravityCalculator.calcualate();
                }
                case "2" -> {
                    Calculator calculator = new Calculator();
                    calculator.factorial();
                }
                case "3" -> {
                    OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
                    Calculator calculator = new Calculator();
                    System.out.println("Please enter number of row");
                    Scanner arrayInputX = new Scanner(System.in);
                    int arrayX = arrayInputX.nextInt();
                    System.out.println("Please enter number of column");
                    Scanner arrayInputY = new Scanner(System.in);
                    int arrayY = arrayInputY.nextInt();
                    int[][] array = new int[arrayX][arrayY];
                    oneDimensionalArray.createRandomArray(array);
                    oneDimensionalArray.readRandomArray(array);
                    calculator.averageTot(array);
                    oneDimensionalArray.maxValueArray(array);
                    oneDimensionalArray.minValueArray(array);
                }
                case "4" -> {
                    Marathon marathon = new Marathon();
                    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
                    int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
                    marathon.printResults(names, times);
                }
                case "5" -> {
                    OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
                    Calculator calculator = new Calculator();
                    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
                    System.out.println("Enter number of row");
                    Scanner arrayInputX = new Scanner(System.in);
                    int arrayX = arrayInputX.nextInt();
                    System.out.println("Enter number of column");
                    Scanner arrayInputY = new Scanner(System.in);
                    int arrayY = arrayInputY.nextInt();
                    int[][] array = new int[arrayX][arrayY];
                    oneDimensionalArray.createRandomArray(array);
                    calculator.averageTot(array);
                    oneDimensionalArray.readRandomArray(array);
                    calculator.averageCol(array);
                }
                case "6&7" -> {
                    Animals animals = new Animals();
                    animals.main();
                }

                default -> System.out.println("Choose the good program");
            }
            System.out.println("Do you want to continue [y] yes, [n] no");


        } while (yesno.next().equalsIgnoreCase("y"));
        yesno.close();
    }
}
