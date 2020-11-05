package services;

import models.Cymbal;

import java.util.ArrayList;

public class CymbalService {
    private static int nextId = 1;

    private ArrayList<Cymbal> inventory = new ArrayList<>();

    public Cymbal create(int size, String brand, String name, String type, float price, int qty){

        Cymbal createdCymbal = new Cymbal(size, brand, name, type, nextId++, price, qty);

        inventory.add(createdCymbal);

        return createdCymbal;
    }

}
