package models;

public class Cymbal {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int qty;
    private float price;
    private String type;

    public Cymbal(){

    }

    public Cymbal(int size, String brand, String name, String type, int id, float price, int qty){
        this.size = size;
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.id = id;
        this.price = price;
        this.qty = qty;
    }

    public Cymbal(int size, String brand, String name, String type, float price , int qty, int id) {
        this.size = size;
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.price = price;
        this.qty = qty;
        this.id = id;
    }


    public String getName() {
    return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand) { this.brand = brand;
    }

    public String getBrand() { return brand;
    }

    public void setId(int id) { this.id = id;
    }

    public int getId() { return id;
    }

    public void setSize(int size) { this.size = size;
    }

    public int getSize() { return size;
    }

    public void setQty(int qty) { this.qty = qty;
    }

    public int getQty() { return qty;
    }

    public void setPrice(float price) { this.price = price;
    }

    public float getPrice() { return price;
    }

    public void setType(String type) { this.type = type;
    }

    public String getType() { return type;
    }
}
