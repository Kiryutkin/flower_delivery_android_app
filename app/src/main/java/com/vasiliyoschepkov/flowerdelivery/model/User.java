package com.vasiliyoschepkov.flowerdelivery.model;

/**
 * Пользователь
 */

public class User {
    private final long ID;
    private String name;
    private String lastName;
    private String middleName;
    private TypeUser typeUser;
    private int years;
    private int phone;

    public User(long ID, String name, String lastName, String middleName, TypeUser typeUser, int years) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.typeUser = typeUser;
        this.years = years;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
