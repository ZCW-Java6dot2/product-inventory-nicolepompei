package services;

import models.SnareDrum;
import org.junit.Assert;
import org.junit.Test;

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
}
