// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan4;

public class Product {

    private int id;
    private String name;
    private String descripton;
    private double price;
    private Product Type;

    public Product() {
    }

    public Product(String name, String descripton, double price) {

        this.name = name;
        this.descripton = descripton;
        this.price = price;
    }

    public Product(String name, String descripton, double price, Product Type) {
        this.name = name;
        this.descripton = descripton;
        this.price = price;
        this.Type = Type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Id: " + id + " " + "Name: " + name + " " + "decription: " + descripton + " " + "price: " + price);
    }

    public void GetById(int id) {
        if (this.id == id) {
            toString();
        }

    }

}
