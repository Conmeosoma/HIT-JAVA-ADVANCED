package tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {

    private ArrayList<Product> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhap so luong san pham ban muon them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("nhap loai san pham ban muon them:  ");
            String type = sc.nextLine();
            sc.nextLine();
            if (type.equalsIgnoreCase("laptop")) {
                System.out.println("NHap ten laptop: ");
                String name = sc.nextLine();
                System.out.println("Nhap mieu ta laptop: ");
                String description = sc.nextLine();
                System.out.println("Nhap gia: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Nhap dung luog Ram: ");
                String ram = sc.nextLine();
                System.out.println("Nhap Ten CPU: ");
                String cpu = sc.nextLine();
                products.add(new Laptop(name, description, price, ram, cpu));
                System.out.println("Them laptop thanh cong!");
            } else if (type.equalsIgnoreCase("smartphone")) {
                System.out.println("Nhap ten dien thoai: ");
                String name = sc.nextLine();
                System.out.println("Nhap mieu ta dien thoai: ");
                String description = sc.nextLine();
                System.out.println("Nhap gia: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("DIen thoai co ho tro 5G khong?(T/F): ");
                boolean has5G = sc.nextBoolean();
                sc.nextLine();
                products.add(new SmartPhone(name, description, price, has5G));
                System.out.println("Them dien thoai thanh cong!");

            } else {
                System.out.println("Loai sp k hop le");
            }
        }
    }

    public void removeById(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public Product getById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
