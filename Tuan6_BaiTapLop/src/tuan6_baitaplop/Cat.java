// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class Cat extends Animal  {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void eat() {
        System.out.println("Ca");
    }

    @Override
    public void move() {
        System.out.println("hehehe");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

}
