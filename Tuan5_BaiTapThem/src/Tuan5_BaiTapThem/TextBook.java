package Tuan5_BaiTapThem;

// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, String author, double price, int quantity) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

}
