package models;

public class Atributte {

    private int health;
    private int stamina;
    private int strong;
    private int speed;

    public Atributte() {
    }

    public Atributte(int health, int stamina, int strong, int speed) {
        this.health = health;
        this.stamina = stamina;
        this.strong = strong;
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
