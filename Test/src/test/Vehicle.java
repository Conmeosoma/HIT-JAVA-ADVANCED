// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package test;

public abstract class Vehicle {
    private String id;
    private String name;
    private int productionYear;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String id, String name, int productionYear, double price) {
        this.id = id;
        this.name = name;
        this.productionYear = productionYear;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{id=%s, name=%s, productionYear=%d, price=%.2f}", id, name, productionYear, price);
    }
    public double getTax(){
        return 0;
    }

}
