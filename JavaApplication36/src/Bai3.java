
import java.util.Scanner;

// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diachi = sc.nextLine();
        System.out.println(ten + " " + tuoi + " " + diachi);
    }

}
