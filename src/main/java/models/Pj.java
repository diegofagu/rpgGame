package models;


import java.util.ArrayList;

public class Pj {

    private String name ;
    private int age ;
    private String origin;
    private ArrayList<Inventory> inventories = new ArrayList<Inventory>();
    private ArrayList<Atributte> atributtes = new ArrayList<Atributte>();

    public Pj() {
    }

    public Pj(String name, int age, String origin, ArrayList<Inventory> inventories, ArrayList<Atributte> atributtes) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.inventories = inventories;
        this.atributtes = atributtes;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<Inventory> inventories) {
        this.inventories = inventories;
    }

    public ArrayList<Atributte> getAtributtes() {
        return atributtes;
    }

    public void setAtributtes(ArrayList<Atributte> atributtes) {
        this.atributtes = atributtes;
    }
}
