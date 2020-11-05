package models;

import org.junit.Assert;
import org.junit.Test;

public class SnareDrumTest {

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
        int expected = 54322;

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
}
