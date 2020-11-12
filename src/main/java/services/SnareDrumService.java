package services;

import models.SnareDrum;

import java.util.ArrayList;

public class SnareDrumService {
    private static int nextId = 1;

    private static ArrayList<SnareDrum> inventory = new ArrayList<>();

    public static SnareDrum create(int depth, String brand, String name, String shellType, int qty, float price){
        SnareDrum createdSnareDrum = new SnareDrum(depth, brand, name, shellType, qty, price, nextId++);

        inventory.add(createdSnareDrum);

        return createdSnareDrum;
    }

    public static SnareDrum find(int id){
        for(SnareDrum element: inventory){
            if(inventory.contains(element)){
                return element;
            }
        }

        return null;

    }

    public static ArrayList<SnareDrum> findAll(){

        //SnareDrum[] resultsArray = inventory.toArray(new SnareDrum[0]);
        //return resultsArray;

        return inventory;
    }

    public static boolean delete(int id){

        SnareDrum snare = new SnareDrum();
       inventory.remove(id);

       //some sort of if statement if length of array list is greater than 0 delete the snare drum at the current id and return true else return false


        System.out.println("Product deleted successfully!");

        return false;
    }


}
