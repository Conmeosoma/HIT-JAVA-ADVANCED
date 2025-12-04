// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package test;

public class Car extends Vehicle {
    private String brand;
    private int seatNumber;
    private double extraFee;

    public Car() {
    }

    public Car(String brand, int seatNumber, double extraFee, String id, String name, int productionYear,
            double price) {
        super(id, name, productionYear, price);
        this.brand = brand;
        this.seatNumber = seatNumber;
        this.extraFee = extraFee;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(double extraFee) {
        this.extraFee = extraFee;
    }

    @Override
    public double getTax() {
        return getPrice() * 0.1 + extraFee;
    }   

    @Override
    public String toString() {
        return String.format("Car{brand=%s, seatNumber=%d, extraFee=%.2f, %s}", brand, seatNumber, extraFee,
                super.toString());
    }

}
