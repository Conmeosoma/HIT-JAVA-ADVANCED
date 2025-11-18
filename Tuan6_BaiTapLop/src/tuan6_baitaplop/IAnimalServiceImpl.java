// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

import java.util.ArrayList;
import java.util.List;

public class IAnimalServiceImpl implements IAnimalService {

    public IAnimalServiceImpl() {
    }

    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> tmp = new ArrayList<>();
        for (Animal a : tmp) {
            if (a.swim() == true) {
                tmp.add(a);
            }
        }
        return tmp;
    }

    @Override
    public List<Animal> animalsFlyable(List<Animal> animals) {
        List<Animal> tmp2 = new ArrayList<>();
        for (Animal b : tmp2) {
            if (b.fly() == true) {
                tmp2.add(b);
            }
        }
        return tmp2;
    }

    @Override
    public boolean deleteAnimalSwimmable(List<Animal> animals) {
        boolean flag = false;
        for(int i = 0 ; i < animals.size();i++){
            if(animals.get(i).swim() == true){
                animals.remove(i);
                flag = true;
            }
        }

        return flag;
    }

    @Override
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals) {
       boolean flag = false;
        for(int i = 0 ; i < animals.size();i++){
            if(animals.get(i).fly()== true){
                animals.remove(i);
                flag = true;
            }
        }

        return flag;
    }

}
