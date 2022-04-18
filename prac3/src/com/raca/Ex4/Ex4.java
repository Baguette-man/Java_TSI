package com.raca.Ex4;
import java.text.Collator;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list_bis = new ArrayList<>();
        list.add("a1");
        list.add("c2");
        list.add("a2");
        list.add("c3");
        list.add("b3");
        list.add("b1");
        list.add("c1");
        list.add("b2");
        list.add("a3");
        String start = "c";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(start)) {
                list_bis.add(list.get(i));
            }
        }
        for (int i = 0; i < list_bis.size(); i++) {
            String newValue = list_bis.get(i).toUpperCase();
            list_bis.set(i, newValue);
        }
        java.util.Collections.sort(list_bis, Collator.getInstance());
        System.out.println(list_bis);
    }
}