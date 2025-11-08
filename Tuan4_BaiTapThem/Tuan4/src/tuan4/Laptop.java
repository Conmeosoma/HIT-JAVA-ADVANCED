/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan4;

public class Laptop extends Product {

    private String ram;
    private String cpu;

    public Laptop() {
    }

    public Laptop(String name, String descripton, double price, String ram, String cpu) {
        super(name, descripton, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Ram: " + ram + " " + "CPU: " + cpu);

    }

}
