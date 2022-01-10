package com.company;

public class Main {


    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(700);
	boss.setDamage(200);
	boss.setWeapon(new Weapon("Sword", " Steel arms"));
        System.out.println("Жизнь босса " + boss.getHealth() + " Урон босса" + boss.getDamage() +
                " Тип оружия " + boss.weapon.getName() + "" + " Название оружия " + boss.weapon.getType());

		System.out.println("Информация о боссе" + " " + boss.printInfo());

		Skeleton skeleton = new Skeleton();
		skeleton.setHealth(100);
		skeleton.setDamage(20);


		Skeleton skeleton1 = new Skeleton();
		skeleton.setHealth(150);
		skeleton.setDamage(40);
		System.out.println(skeleton.getHealth() + " " + skeleton.getDamage() + " " + skeleton.getArrows());
		System.out.println(skeleton1.getHealth() + " " + skeleton1.getDamage() + " " + skeleton1.getArrows());
    }
}
