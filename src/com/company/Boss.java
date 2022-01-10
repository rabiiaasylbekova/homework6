package com.company;

public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Жизнь 700" + " " + "Урон 200";
    }
}
