package services;

import models.Cymbal;
import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedType,actualType);
        Assert.assertEquals(expectedPrice, actualPrice, 0.000000009);
        Assert.assertEquals(expectedQty, actualQty);

    }
}
