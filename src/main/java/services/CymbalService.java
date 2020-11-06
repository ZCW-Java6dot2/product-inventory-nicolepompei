package services;

import models.Cymbal;

import java.util.ArrayList;

public class CymbalService {
    private static int nextId = 1;
    public Cymbal toArray;

    private ArrayList<Cymbal> inventory = new ArrayList<>();

  //  public Cymbal create(int size, String brand, String name, String type, float price, int qty, int id) {
   //     Cymbal createdCymbal = new Cymbal(size, brand, name, type, price, qty, id);

   //     inventory.add(createdCymbal);
   //     return createdCymbal;
   // }

    public Cymbal create(int size, String brand, String name, String type, float price, int qty){

        Cymbal createdCymbal = new Cymbal(size, brand, name, type, nextId++, price, qty);

        inventory.add(createdCymbal);

        return createdCymbal;
    }


    public Cymbal find(int id){

        Cymbal results = inventory.get(id - 1);
        return results;

        }





   public Cymbal[] findAll(){

        Cymbal[] resultsArray = inventory.toArray(new Cymbal[0]);
        return resultsArray;
   }

    public boolean delete(int id){

        inventory.remove(id - 1);

        return true;

   }



}
