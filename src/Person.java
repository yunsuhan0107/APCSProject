/*
Name: Yunsu Han
Date: September 28, 2019
Class: APCS, E Section
Description: This class receives a person's name and age and allows to get the values by getters.
 */

class Person {
    private String name;
    private double age;

    Person(String name, double age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
}
