package com.company;

public class Weapon {
    private String name;
    private String Type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Weapon(String name, String type){
        this.name = name;
        Type = type;
    }

}
