// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
        System.out.println("an com");
    }

    @Override
    public void move() {
        System.out.println("Chay");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" + '}';
    }
    

}
