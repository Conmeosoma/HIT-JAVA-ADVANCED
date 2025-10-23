package tuan2_baitapthem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils BaiTap = new Utils();
        int choice;
        do {
            System.out.println("_____MENU_____");
            System.out.println("0. Nhap mang");
            System.out.println("1. Tinh tong cac phan tu trong mang");
            System.out.println("2. In ra phan tu lon nhat, nho nhat trong mang");
            System.out.println("3. Sap xep mansg theo chieu tang dan");
            System.out.println("4. In ra cac so nguyen to lon nhat co trong mang");
            System.out.println("______________");
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    BaiTap.addArray();

                    break;
                case 1:
                    BaiTap.sum();

                    break;
                case 2: 
                    System.out.println("So lon nhat co trong mang la: " + BaiTap.searchMax(BaiTap.a, BaiTap.n));
                    
                    BaiTap.searchMin();
                    break;
                case 3:
                    BaiTap.bubbleSort();

                    break;
                case 4:
                    BaiTap.showPrimeInArray();

                    break;
                default:
                    System.out.println("Nhap so khong hop le! VUi long nhap lai!!!");
            }

        } while (true);
    }

}
