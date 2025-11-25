package tuan6_baitaplop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("LULU", 12));
        zoo.add(new Cat("Tieu ho", 2));
        zoo.add(new Brid("chao mao", 1));
        IAnimalServiceImpl service = new IAnimalServiceImpl();
        
        System.out.println("DV can to Swim");
        List<Animal> swimmAnimals = service.animalsSwimmable(zoo);
        swimmAnimals.forEach(System.out::println);
        

    }
}
