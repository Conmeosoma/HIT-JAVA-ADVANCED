/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tuan5_BaiTapThem;

/**
 *
 * @author ADMIN
 */
public interface IBookService {

    public void addBook(Book book);

    public void getBookById(String Id);

    public void getAllBooksByCategory(Object catagory);

    public void deleteBookById(String Id);

    public void getAllBooks();

    public void calculateTotalValue();

}
