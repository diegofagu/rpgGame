package services;

import models.Pj;

import java.util.ArrayList;
import java.util.Scanner;

public class Init {

    ArrayList<Pj> pj = new ArrayList<>();


    public Pj create(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del personaje : ");
        String name = sc.nextLine();

        pj.add(name);

       return new Pj();
    }

}
