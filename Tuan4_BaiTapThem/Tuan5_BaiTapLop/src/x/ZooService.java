// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package x;

import java.awt.font.GlyphVector;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Animal> listAnimals = new ArrayList<>();
    public void addAnimal(Animal a){
        listAnimals.add(a);
    }
    public void showAllAnimal(){
        for(Animal a : listAnimals){
            a.showInfo();
            a.makeSound();
        }
    }
    public void findByName(){
        boolean flag = false;
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        for(int i = 0 ;i < listAnimals.size();i++){
            if(listAnimals.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("Tim thay");
                listAnimals.get(i).showInfo();
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Khong tim thayu");
            
        }
    }
    public void searchAge(){
        boolean flag = false;
        System.out.println("Nhap ten: ");
        int tuoi = sc.nextInt();
        for(int i = 0 ;i < listAnimals.size();i++){
            if(listAnimals.get(i).getAge() == tuoi){
                System.out.println("Tim thay");
                listAnimals.get(i).showInfo();
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Khong tim thayu");
            
        }
    }
        
    }

