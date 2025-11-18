// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package x;

public class Lion extends Animal{
    private double weight;

    public Lion() {
    }

    public Lion(double weight) {
        this.weight = weight;
    }

    public Lion(double weight, String id, String name, int age) {
        super(id, name, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void makeSound(){
        System.out.println("GAOOOOOOOOOOO GAU GAU");
    }

}
