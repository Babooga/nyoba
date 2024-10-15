package com.method;

//player
class Player{
    String name;
    double health;
    int level;

    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nname : "+ this.name);
        System.out.println("health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

//senjata
class Weapon{ 
    double attackPower;
    String name;


    //constructor untuk Weapon
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("weapon : " +this.name + " , power : " + this.attackPower);
    }

}

//armor

class Armor{
    double defencePower;
    String name;

    //constructor untuk Armor
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " +this.name + " , defence : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("otong",50);

        //membuat object weapon
        Weapon pedang = new Weapon("pedang" ,15);
        Weapon ketapel = new Weapon("ketapel", 20);

        //membuat object armor
        Armor bajuBesi = new Armor("bajuBesi" , 10);
        Armor chitinArmor = new Armor("chitinArmor", 20);


        //equip senjata dan armor
        //player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        //player2
        player2.equipWeapon(ketapel);
        player2.equipArmor(chitinArmor);
        player2.display();

        
    }
}