package services;

import models.SnareDrum;

import java.util.ArrayList;

public class SnareDrumService {
    private static int nextId = 1;

    private ArrayList<SnareDrum> inventory = new ArrayList<>();

    public SnareDrum create(int depth, String brand, String name, String shellType, int qty, float price){
        SnareDrum createdSnareDrum = new SnareDrum(depth, brand, name, shellType, qty, price, nextId++);

        inventory.add(createdSnareDrum);

        return createdSnareDrum;
    }


}
