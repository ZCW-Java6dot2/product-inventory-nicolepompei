package models;

public class Cymbal {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int qty;
    private float price;
    private String type;



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

    public double getPrice() { return price;
    }

    public void setType(String type) { this.type = type;
    }

    public String getType() { return type;
    }
}
