package com.raca.Ex2;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> listUppercase = new ArrayList<>();
        listUppercase.add("a1");
        listUppercase.add("c2");
        listUppercase.add("a2");
        listUppercase.add("c3");
        listUppercase.add("b3");
        listUppercase.add("b1");
        listUppercase.add("c1");
        listUppercase.add("b2");
        listUppercase.add("a3");
        for (int i = 0; i < listUppercase.size(); i++) {
            String newValue = listUppercase.get(i).toUpperCase();
            listUppercase.set(i, newValue);
        }
        System.out.println(listUppercase);
    }
}