// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Tuan5_BaiTapThem;

import java.util.ArrayList;
import java.util.List;

public class IBookServiceImpl implements IBookService {

    List<Book> Books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null || book.getId() == null || book.getId().isEmpty()) {
            System.out.println("dau vao khong hop le!!!");
            return;
        }
        // check trung id
        for (Book b : Books) {
            if (b.getId().equalsIgnoreCase(book.getId())) {
                System.out.println("Da co trong danh sach");
                return;
            }
        }
        Books.add(book);
        System.out.println("da them thanh cong sach" + book.getTitle() + "!!");

    }

    @Override
    public void getBookById(String Id) {
        boolean flag = false;
        for (Book b : Books) {
            if (b.getId().equals(Id)) {
                System.out.println("Da tim thay" + b.getTitle());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Khong tim thay sach co " + Id);
        }
    }

    @Override
    public void getAllBooksByCategory(Object category) {
        boolean flag = false;

        for (Book b : Books) {

            if (b instanceof TextBook
                    && ((TextBook) b).getSubject().equalsIgnoreCase(category.toString())) {

                b.displayInfo();
                System.out.println();
                flag = true;
            }

            if (b instanceof Novel
                    && ((Novel) b).getGenre().equalsIgnoreCase(category.toString())) {

                b.displayInfo();
                System.out.println();
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Khong tim thay sach thuoc category: " + category);
        }
    }

    @Override
    public void deleteBookById(String Id) {
        Book b = new Book();
        for (int i = 0; i < Books.size(); i++) {
            if (Books.get(i).getId().equalsIgnoreCase(Id)) {
                Books.remove(i);
                System.out.println("Xoa Thanh Cong!!!");
                return;
            }
        }
        System.out.println("Xoa that ban ID da nhap khong co ten torng danh sach");
    }

    @Override
    public void getAllBooks() {
        if (Books.isEmpty()) {
            System.out.println("Ds sach dang trong!!");
        } else {
            for (Book b : Books) {
                b.displayInfo();
            }
        }
    }

    @Override
    public void calculateTotalValue() {
        double total = 0.0;
        for (Book b : Books) {
            total += b.getPrice() * b.getQuantity();
        }
        System.out.println("Tong gia tri topng kho cua sach: " + total);
    }

}
