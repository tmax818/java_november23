package co.tylermaxwell.hoppersreceipt.models;

public class Item {
    private String name;
    private String itemName;
    private double price;
    private String description;
    private String vendor;


    public Item() {
    }


    public Item(String name, String itemName, double price, String description, String vendor) {
        this.name = name;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.vendor = vendor;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", itemName='" + getItemName() + "'" +
            ", price='" + getPrice() + "'" +
            ", description='" + getDescription() + "'" +
            ", vendor='" + getVendor() + "'" +
            "}";
    }




    
}
