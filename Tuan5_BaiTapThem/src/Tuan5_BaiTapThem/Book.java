package Tuan5_BaiTapThem;

// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
public class Book implements Borrowable {

    private String id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String id, String title, String author, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // logic muon sach
    @Override
    public boolean borrow(int quantity) {
        // so luong nho hon khong thi return false
        if (quantity <= 0) {
            System.out.println("So luong muon sach phai lon hon 0!!!");
            return false;
        } // so sanh voi so luong sach minh dang co
        else if (quantity > this.quantity) {
            System.out.println("So luong qua lon khong the muon!!!");
            return false;
        } else {
            this.quantity -= quantity;
            System.out.println("Thanh cong da cho muon  " + quantity + " quyyen sach" + this.title + "'.");
            return true;

        }
    }

    // code tra ve so luong con lai
    @Override
    public int getAvaiableQuantity() {
        // tra lai thucio tinh quantity hien tai cua doi tuong book
        return this.quantity;
    }

    public void displayInfo() {
        System.out.print("Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity=" + quantity + '}');

    }

}
