// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class Brid extends Animal {

    public Brid() {
    }

    public Brid(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("coc coc");
    }

    @Override
    public void move() {
        System.out.println("Nhay nhot");
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

}
