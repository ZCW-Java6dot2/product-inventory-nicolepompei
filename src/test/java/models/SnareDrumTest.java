package models;

import org.junit.Assert;
import org.junit.Test;

public class SnareDrumTest {

    @Test
    public void constructorTest(){
        int expectedDepth = 6;
        String expectedName = "Patina Brass";
        String expectedBrand = "Pork Pie";
        String expectedShellType = "Brass";
        int expectedQty = 3;
        float expectedPrice = 329.99f;
        int expectedId = 100;

        SnareDrum testSnareDrum = new SnareDrum(expectedDepth, expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice);
        SnareDrum testSnareDrum2 = new SnareDrum(expectedDepth, expectedBrand, expectedName, expectedShellType, expectedQty, expectedPrice, expectedId);

        Assert.assertEquals(expectedDepth, testSnareDrum.getDepth());
        Assert.assertEquals(expectedBrand, testSnareDrum.getBrand());
        Assert.assertEquals(expectedName, testSnareDrum.getName());
        Assert.assertEquals(expectedShellType, testSnareDrum.getShellType());
        Assert.assertEquals(expectedQty, testSnareDrum.getQty());
        Assert.assertEquals(expectedPrice, testSnareDrum.getPrice(), 0.000000009);
        Assert.assertEquals(expectedId, testSnareDrum.getId());

    }

    @Test
    public void setNameTest(){
        String expected = "Patina Brass";

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setName(expected);

        Assert.assertEquals(expected, testSnareDrum.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "Pork Pie";

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setBrand(expected);

        Assert.assertEquals(expected, testSnareDrum.getBrand());
    }

    @Test
    public void setIdTest(){
        int expected = 100;

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setId(expected);

        Assert.assertEquals(expected, testSnareDrum.getId());
    }

    @Test
    public void setDepthTest(){
        int expected = 22;

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setDepth(expected);

        Assert.assertEquals(expected, testSnareDrum.getDepth());
    }

    @Test
    public void setQtyTest(){
        int expected = 3;

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setQty(expected);

        Assert.assertEquals(expected, testSnareDrum.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 329.99f;

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setPrice(expected);

        Assert.assertEquals(expected, testSnareDrum.getPrice(), 0.00000009);
    }

    @Test
    public void setShellType(){
        String expected = "Brass";

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setShellType(expected);

        Assert.assertEquals(expected, testSnareDrum.getShellType());
    }

    @Test
    public void setDepth(){
        int expected = 6;

        SnareDrum testSnareDrum = new SnareDrum();
        testSnareDrum.setDepth(expected);

        Assert.assertEquals(expected, testSnareDrum.getDepth());
    }
}
