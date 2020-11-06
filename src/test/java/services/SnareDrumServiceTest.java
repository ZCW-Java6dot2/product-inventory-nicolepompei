package services;

import models.Cymbal;
import models.SnareDrum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class SnareDrumServiceTest {
    @Test

    public void createTest(){

        int expectedDepth = 6;
        String expectedName = "Patina Brass";
        String expectedBrand = "Pork Pie";
        String expectedShellType = "Brass";
        int expectedQty = 3;
        float expectedPrice = 329.99f;
        int expectedId = 2;

        SnareDrumService snareDrumService = new SnareDrumService();
        SnareDrumService snareDrumService1 = new SnareDrumService();

        SnareDrum testSnareDrum = snareDrumService.create(expectedDepth,expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice);
        SnareDrum testSnareDrum2 = snareDrumService1.create(expectedDepth,expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice);


        int actualDepth = testSnareDrum.getDepth();
        String actualName = testSnareDrum.getName();
        String actualBrand = testSnareDrum.getBrand();
        String actualShellType = testSnareDrum.getShellType();
        int actualQty = testSnareDrum.getQty();
        float actualPrice = testSnareDrum.getPrice();
        int actualId = testSnareDrum.getId();



        Assert.assertEquals(expectedDepth, actualDepth);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedShellType, actualShellType);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice, 0.00000009);
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());


    }

    @Test
    public void findTest(){
        int expectedDepth = 6;
        String expectedName = "Patina Brass";
        String expectedBrand = "Pork Pie";
        String expectedShellType = "Brass";
        int expectedQty = 3;
        float expectedPrice = 329.99f;
        int expectedId = 1;

        SnareDrumService snareDrumService = new SnareDrumService();
        SnareDrum testSnareDrum = snareDrumService.create(expectedDepth, expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice);
        SnareDrum actualResults = snareDrumService.find(expectedId);
        SnareDrum expectedResults = testSnareDrum;

        Assertions.assertEquals(expectedResults, actualResults);
    }

    @Test
    public void findAllTest(){
        ArrayList<SnareDrum> inventory = new ArrayList<>();
        SnareDrumService snareDrums = new SnareDrumService();
        SnareDrum patinaBrass = snareDrums.create(6, "Pork Pie", "Patina Brass", "Brass", 3, 329.00f);
        SnareDrum acrolite = snareDrums.create(5, "Ludwig", "Acrolite", "Aluminum", 4, 429.00f);
        SnareDrum supraphonic = snareDrums.create(5, "Ludwig", "Supraphonic", "Aluminum", 2, 549.00f);

        inventory.add(patinaBrass);
        inventory.add(acrolite);
        inventory.add(supraphonic);


        SnareDrum[] actual = snareDrums.findAll();
        SnareDrum[] expected = inventory.toArray(new SnareDrum[actual.length]);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void delete(){


        SnareDrumService testSnareDrum2 = new SnareDrumService();
        SnareDrum acrolite = testSnareDrum2.create(5, "Ludwig", "Acrolite", "Aluminum", 4, 4290.00f);

        boolean actual = testSnareDrum2.delete(1);

        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }
}
