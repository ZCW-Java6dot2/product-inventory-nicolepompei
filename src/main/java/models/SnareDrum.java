package models;

public class SnareDrum {
    private int id;
    private String name;
    private String brand;
    private int depth;
    private int qty;
    private float price;
    private String shellType;

    public void setName(String name) { this.name = name;
    }

    public String getName() { return name;
    }

    public void setBrand(String brand) { this.brand = brand;
    }

    public String getBrand() {return brand;
    }

    public void setId(int id) { this.id = id;
    }

    public int getId() { return id;
    }

    public void setDepth(int depth) { this.depth = depth;
    }

    public int getDepth() { return depth;
    }

    public void setQty(int qty) { this.qty = qty;
    }

    public int getQty() { return qty;
    }

    public void setPrice(float price) { this.price = price;
    }

    public float getPrice() { return price;
    }

    public void setShellType(String shellType) { this.shellType = shellType;
    }

    public String getShellType() {return shellType;
    }
}
