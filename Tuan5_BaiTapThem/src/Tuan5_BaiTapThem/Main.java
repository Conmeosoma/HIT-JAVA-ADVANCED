package Tuan5_BaiTapThem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookServiceImpl hehe = new IBookServiceImpl();

        while (true) {
            System.out.println("____MENU____");
            System.out.println("1. Add book");
            System.out.println("2. Tim theo ID");
            System.out.println("3. Tim theo Category (genre/subject)");
            System.out.println("4. Xoa sach");
            System.out.println("5. Lay tat ca sach");
            System.out.println("6. Tinh tong gia tri trong kho");
            System.out.print("Nhap lua chon cua ban: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhap id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap title: ");
                    String title = sc.nextLine();
                    System.out.print("Nhap author: ");
                    String author = sc.nextLine();
                    System.out.print("Nhap price: ");
                    double price = sc.nextDouble();
                    System.out.print("Nhap quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    hehe.addBook(new Book(id, title, author, price, quantity));
                }

                case 2 -> {
                    System.out.print("Nhap ID: ");
                    String id = sc.nextLine();
                    hehe.getBookById(id);
                }

                case 3 -> {
                    System.out.print("Nhap category (subject hoặc genre): ");
                    String cat = sc.nextLine();
                    hehe.getAllBooksByCategory(cat);
                }

                case 4 -> {
                    System.out.print("Nhap ID sach muon xoa: ");
                    String id = sc.nextLine();
                    hehe.deleteBookById(id);
                }

                case 5 ->
                    hehe.getAllBooks();

                case 6 ->
                    hehe.calculateTotalValue();

                default ->
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
