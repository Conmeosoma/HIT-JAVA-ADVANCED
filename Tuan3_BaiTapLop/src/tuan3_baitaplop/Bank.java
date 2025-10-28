// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan3_baitaplop;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> dsKhachHang = new ArrayList<>();
    public static void add(){
        System.out.println("Nhap so luong khach hang: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n;i++){
            System.out.println("Nhap id: ");
            String id = sc.nextLine();
            System.out.println("Nhap name: ");
            String name = sc.nextLine();
            System.out.println("Nhap so du: ");
            double banlance = sc.nextDouble();
            User kh = new User(id, name, banlance);
            dsKhachHang.add(kh);
        }
    }
    
   
    

}
