package models;

import org.junit.Assert;
import org.junit.Test;
import sun.security.x509.DeltaCRLIndicatorExtension;

public class CymbalTest {

    @Test
    public void constructorTest(){
        int expectedSize = 22;
        String expectedBrand = "Dream";
        String expectedName = "Vintage Bliss";
        String expectedType = "crash/ride";
        int expectedQty = 4;
        float expectedPrice = 325.00f;
        int expectedId = 5;

        Cymbal testCymbal = new Cymbal(expectedSize, expectedBrand, expectedName, expectedType, expectedId, expectedPrice, expectedQty);

        Assert.assertEquals(expectedSize, testCymbal.getSize());
        Assert.assertEquals(expectedBrand, testCymbal.getBrand());
        Assert.assertEquals(expectedName, testCymbal.getName());
        Assert.assertEquals(expectedType, testCymbal.getType());
        Assert.assertEquals(expectedId, testCymbal.getId());
        Assert.assertEquals(expectedPrice, testCymbal.getPrice(), 0.00000009);
        Assert.assertEquals(expectedQty, testCymbal.getQty());
    }

    @Test
    public void setNameTest(){
        String expected = "Vintage Bliss";

        Cymbal testCymbal = new Cymbal();
                testCymbal.setName(expected);

        Assert.assertEquals(expected, testCymbal.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "Dream";

        Cymbal testCymbal = new Cymbal();
            testCymbal.setBrand(expected);

         Assert.assertEquals(expected, testCymbal.getBrand());
    }

    @Test
    public void setIdTest(){
        int expected = 5;

        Cymbal testCymbal = new Cymbal();
        testCymbal.setId(expected);

        Assert.assertEquals(expected, testCymbal.getId());
    }

    @Test
    public void setSizeTest(){
        int expected = 22;

        Cymbal testCymbal = new Cymbal();
        testCymbal.setSize(expected);

        Assert.assertEquals(expected, testCymbal.getSize());
    }

    @Test
    public void setQtyTest(){
        int expected = 4;

        Cymbal testCymbal = new Cymbal();
        testCymbal.setQty(expected);

        Assert.assertEquals(expected, testCymbal.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 325.00f;

        Cymbal testCymbal = new Cymbal();
        testCymbal.setPrice(expected);

        Assert.assertEquals(expected, testCymbal.getPrice(), 0.00000009);
    }

    @Test
    public void setType(){
        String expected = "Crash/Ride";

        Cymbal testCymbal = new Cymbal();
        testCymbal.setType(expected);

        Assert.assertEquals(expected, testCymbal.getType());
    }

}
