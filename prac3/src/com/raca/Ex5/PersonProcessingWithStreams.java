package com.raca.Ex5;
import java.util.ArrayList;
import java.util.List;

class PersonProcessingWithStreams {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", 28));
        persons.add(new Person("Peter", 22));
        persons.add(new Person("Anna", 28));
        persons.add(new Person("Lilianna", 16));
        persons.add(new Person("Pamela", 13));
        persons.add(new Person("David", 22));
        PersonEvaluator personEvaluator = new PersonEvaluator(persons);
        System.out.println("\n" + "Name starting from P: ");
        personEvaluator.findAndPrint();
        System.out.println("\n" + "Older than 18: ");
        personEvaluator.groupAndPrint();
        System.out.println("\n" + "Group by age: ");
        personEvaluator.groupByAge();
        System.out.println("\n");
        personEvaluator.getAverageAge();
    }
}