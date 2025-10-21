package tuan2_baitaplop;

import java.util.Scanner;

public class Tuan2_BaiTapLop {

    Scanner sc = new Scanner(System.in);

    public boolean stn(int b) {
        if (b == 2) {
            return true;
        } else if (b < 2 || b % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(b); i += 2) {
                if (b % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }

    public void tinh() {
        int tong = 0;
        int tich = 1;
        for (int i = 0; i < 100; i++) {
            tong += i;
            tich *= i;
        }
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        System.out.println("Tich cac phan tu trong mang la: " + tich);

        System.out.print("Cac phan tu la stn: ");
        for (int i = 0; i < 100; i++) {
            if (stn(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Tuan2_BaiTapLop t2 = new Tuan2_BaiTapLop();
        //     t2.nhap();
        t2.tinh();
    }

}
