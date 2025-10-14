
import java.util.Scanner;


public class Bai1 {
    static int firstNumber,secondNumber;
    static Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap so thu nhat: ");
        firstNumber = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        secondNumber = sc.nextInt();
    }

    public static void main(String[] args) {
        Bai1 b = new Bai1();
        b.nhap();
        System.out.println("Tong 2 so la: " + (firstNumber + secondNumber));
         System.out.println("Hieu 2 so la: " + Math.abs(firstNumber - secondNumber));
          System.out.println("Tich 2 so la: " + (firstNumber * secondNumber));
           System.out.println("Thuong nguyen 2 so la: " + (firstNumber / secondNumber));
            System.out.println("Thuong du 2 so la: " + (firstNumber % secondNumber));
    }

}
