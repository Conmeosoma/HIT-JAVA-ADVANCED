// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan4;

public class SmartPhone extends Product {

    private boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone(String name, String descripton, double price, boolean has5G) {
        super(name, descripton, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Have 5g" + has5G);

    }

}
