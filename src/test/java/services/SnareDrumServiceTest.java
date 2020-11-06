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

        SnareDrumService snareDrumService = new SnareDrumService();

        SnareDrum testSnareDrum = snareDrumService.create(expectedDepth,expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice);


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
        ArrayList<Cymbal> inventory = new ArrayList<>();
        CymbalService dreamCymbals = new CymbalService();
        Cymbal vintageBliss = dreamCymbals.create(22, "Dream", "Vintage Bliss", "Crash/Ride", 325.00f, 4);
        Cymbal darkMatter = dreamCymbals.create(22, "Dream", "Dark Matter", "Ride", 399.00f, 2);
        Cymbal bliss = dreamCymbals.create(24, "Dream", "Bliss", "Ride", 329.99f, 3);

        inventory.add(vintageBliss);
        inventory.add(darkMatter);
        inventory.add(bliss);


        Cymbal[] actual = dreamCymbals.findAll();
        Cymbal[] expected = inventory.toArray(new Cymbal[actual.length]);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void delete(){


        CymbalService testCymbal2 = new CymbalService();
        Cymbal vintageBliss = testCymbal2.create(22, "Dream", "Vintage Bliss", "crash/ride", 325.00f, 4, 1);

        boolean actual = testCymbal2.delete(1);

        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }
}
