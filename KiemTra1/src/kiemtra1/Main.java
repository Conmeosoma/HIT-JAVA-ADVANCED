// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package kiemtra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        IEmployeeServiceImpl serviceImpl = new IEmployeeServiceImpl(employees);
        do {
            System.out.println("1.Add nhan vien");
            System.out.println("2.In ra tat ca nhan vien");
            System.out.println("3.Tim theo id");
            System.out.println("4.Tim theo ten");
            System.out.println("Nhap lua chon cua ban: ");
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    serviceImpl.add();
                    break;
                case 2:
                    employees = serviceImpl.getAllEmployees();
                    for(Employee e : employees ){
                        System.out.println(e.toString());
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhap id: ");
                    String id = sc.nextLine();
                    
                    serviceImpl.getEmloyeeById(id);
                    break;
                case 4:                    
                    List<Employee> tmp = new ArrayList<>();
                    sc.nextLine();
                    System.out.println("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    tmp = serviceImpl.getEmployeeByName(name);
                    if(tmp.isEmpty()){
                        System.out.println("Ds rong");
                    }
                    else{
                        for(Employee e : tmp){
                            System.out.println(e.toString());
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
    
}
