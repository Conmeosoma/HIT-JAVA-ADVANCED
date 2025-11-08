package tuan4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductController dieuKhien = new ProductController();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n_____MENU_____");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi tat ca san pham");
            System.out.println("3. Xoa san pham theo ID");
            System.out.println("4. Tim san pham theo ID");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            while (!sc.hasNextInt()) {
                System.out.print("Nhap so hop le: ");
                sc.next();
            }
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    dieuKhien.addProduct();
                }
                case 2 -> {
                    System.out.println("=== Danh sach san pham ===");
                    if (dieuKhien.getAllProducts().isEmpty()) {
                        System.out.println("Chua co san pham nao.");
                    } else {
                        for (Product sp : dieuKhien.getAllProducts()) {
                            sp.getInfo();
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Nhap ID can xoa: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Nhap so hop le: ");
                        sc.next();
                    }
                    int idXoa = sc.nextInt();
                    sc.nextLine();
                    Product tim = dieuKhien.getById(idXoa);
                    if (tim != null) {
                        dieuKhien.removeById(idXoa);
                        System.out.println("Da xoa san pham co ID = " + idXoa);
                    } else {
                        System.out.println("Khong tim thay san pham co ID = " + idXoa);
                    }
                }
                case 4 -> {
                    System.out.print("Nhap ID can tim: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Nhap so hop le: ");
                        sc.next();
                    }
                    int idTim = sc.nextInt();
                    sc.nextLine();
                    Product sp = dieuKhien.getById(idTim);
                    if (sp != null) {
                        System.out.println("Thong tin san pham:");
                        sp.getInfo();
                    } else {
                        System.out.println("Khong tim thay san pham co ID = " + idTim);
                    }
                }
                case 0 -> {
                    System.out.println("Tam biet!");
                    sc.close();
                    return;
                }
                default -> {
                    System.out.println("Lua chon khong hop le.");
                }
            }
        } while (true);
    }
}
