package services;

import models.Cymbal;
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

    public SnareDrum find(int id){

        SnareDrum results = inventory.get(id-1);
        return results;

    }


}
