
import java.util.Scanner;
// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
public class Bai2 {

    static int soGiay;
    static Scanner sc = new Scanner(System.in);

    public static void nhap() {
        System.out.println("Nhap so giay: ");
        soGiay = sc.nextInt();
    }

    public static void main(String[] args) {
        nhap();
        int gio = soGiay / 3600;
        int phut = (soGiay % 3600) / 60;
        int giay = soGiay % 60;
        System.out.println(" Gio: "+ gio + " Phut: " + phut + " Giay: "+giay);

    }

}
