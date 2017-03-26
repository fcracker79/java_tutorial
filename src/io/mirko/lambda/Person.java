package io.mirko.lambda;

import io.mirko.Gender;

public class Person {
    private final Gender gender;
    private final int age;
    private final String name;
    private final String surname;

    public Person(Gender gender, int age, String name, String surname) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
