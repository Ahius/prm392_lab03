package com.example.footballer;

public class Footballer {
    private String name;
    private String description;
    private int avatar;
    private int national;

    public Footballer(String name, String description, int avatar, int national) {
        this.name = name;
        this.description = description;
        this.avatar = avatar;
        this.national = national;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
    }
}
