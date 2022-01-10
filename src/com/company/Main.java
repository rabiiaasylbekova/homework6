package com.company;

public class Main {


    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(700);
	boss.setDamage(200);
	boss.setWeapon(new Weapon("Sword", " Steel arms"));
        System.out.println("Жизнь босса " + boss.getHealth() + " Урон босса" + boss.getDamage() +
                " Тип оружия " + boss.weapon.getName() + "" + " Название оружия " + boss.weapon.getType());
    }
}
