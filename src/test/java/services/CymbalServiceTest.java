package services;

import models.Cymbal;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class CymbalServiceTest {
    @Test
    public void createTest(){
        int expectedSize = 22;
        String expectedBrand = "Dream";
        String expectedName = "Vintage Bliss";
        String expectedType = "crash/ride";
        float expectedPrice = 325.00f;
        int expectedQty = 4;

        CymbalService cymbalService = new CymbalService();
        Cymbal testCymbal = cymbalService.create(expectedSize, expectedBrand, expectedName, expectedType, expectedPrice, expectedQty);

        int actualSize = testCymbal.getSize();
        String actualBrand = testCymbal.getBrand();
        String actualName = testCymbal.getName();
        String actualType = testCymbal.getType();
        float actualPrice = testCymbal.getPrice();
        int actualQty = testCymbal.getQty();
        int actualId = testCymbal.getId();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedType,actualType);
        Assertions.assertEquals(expectedPrice, actualPrice, 0.000000009);
        Assertions.assertEquals(expectedQty, actualQty);

    }

    @Test
    public void findTest(){
        int expectedSize = 22;
        String expectedBrand = "Dream";
        String expectedName = "Vintage Bliss";
        String expectedType = "crash/ride";
        float expectedPrice = 325.00f;
        int expectedQty = 4;
        int expectedId = 1;

        CymbalService cymbalService = new CymbalService();
        Cymbal testCymbal = cymbalService.create(expectedSize, expectedBrand, expectedName, expectedType, expectedPrice, expectedQty);
        Cymbal actualResults = cymbalService.find(expectedId);
        Cymbal expectedResults = testCymbal;

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
    public void delete(int id){
        
    }

}
