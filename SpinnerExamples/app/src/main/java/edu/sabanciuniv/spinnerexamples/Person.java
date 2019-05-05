package edu.sabanciuniv.spinnerexamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atanaltay on 05/04/2018.
 */

public class Person {
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static List<Person> getPeople(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("altug","tanaltay"));
        people.add(new Person("mehmet","emin"));
        people.add(new Person("ahmet","hemin"));

        return people;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }
}
