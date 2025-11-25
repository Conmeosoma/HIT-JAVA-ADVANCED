// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Tuan5_BaiTapThem;

public class Novel extends Book {

    private String genre;

    public Novel() {
    }

    public Novel(String genre, String id, String title, String author, double price, int quantity) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Genre: " + genre);
    }

}
