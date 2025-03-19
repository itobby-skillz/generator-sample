package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private User user;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, User user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
