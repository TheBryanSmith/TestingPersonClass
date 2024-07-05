package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private String height, race, hometown, favoriteSong;


    public Person() {
    this.name = "";
    this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age, String height, String race, String hometown, String favoriteSong) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.race = race;
        this.hometown = hometown;
        this.favoriteSong = favoriteSong;
    }


    public Person(int age) {
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}
