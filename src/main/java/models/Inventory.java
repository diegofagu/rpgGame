package models;

public class Inventory {

    private int gold;
    private String weapon;
    private String armor;
    private String shield;


    public Inventory() {
    }

    public Inventory(int gold, String weapon, String armor, String shield) {
        this.gold = gold;
        this.weapon = weapon;
        this.armor = armor;
        this.shield = shield;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }
}
