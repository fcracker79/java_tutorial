package io.mirko;

import io.mirko.lambda.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Main {
    private static Collection<Person> collect(Collection<Person> persons, Predicate<Person> predicate) {
        final Collection<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (predicate.test(p)) {
                result.add(p);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        final Collection<Person> persons = Arrays.asList(
                new Person(Gender.MALE, 25, "John", "Burns"),
                new Person(Gender.FEMALE, 30, "Rebecca", "Wilson"),
                new Person(Gender.MALE, 45, "Gene", "Hackman"),
                new Person(Gender.FEMALE, 20, "Marylin", "Monroe")
        );
        System.out.format("Invoking a function that takes a predicate: \n%s\n", collect(persons, p -> p.getGender() == Gender.MALE));
        final Object[] streamed = persons.stream().filter(p -> p.getGender() == Gender.MALE)
                .map(p -> String.format("%s %s", p.getName(), p.getSurname())).toArray();
        System.out.format("Using streams: \n%s\n", Arrays.asList(streamed));
        System.out.println("Using consumers with streams");
        persons.stream().filter(p -> p.getGender() == Gender.MALE).map(p -> String.format("%s %s", p.getName(), p.getSurname()))
                .forEach(System.out::println);
    }
}
