package com.raca.Ex3;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list_b = new ArrayList<>();
        list.add("a1");
        list.add("c2");
        list.add("a2");
        list.add("c3");
        list.add("b3");
        list.add("b1");
        list.add("c1");
        list.add("b2");
        list.add("a3");
        String startB="b";
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).startsWith(startB))
            {
                list_b.add(list.get(i));
            }
        }
        System.out.println(list_b);

    }
}