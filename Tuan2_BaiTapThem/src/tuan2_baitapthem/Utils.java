// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan2_baitapthem;

import java.util.Scanner;

public class Utils {

    public Utils() {
    }
    Scanner sc = new Scanner(System.in);
    int n, m;

    int[] a = new int[99999];
    int[] test = new int[99999];

    public void addArray() {
        System.out.println("Nhap so phan tu co trong mang");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public void showArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void sum() {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("Tong cac so co trong mang la: " + tong);
    }

    // ham tim max
    public int searchMax(int a[], int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

    }

    public void searchMin() {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("So nho nhat co trong mang la: " + min);
    }

    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            showArray();
        }

    }

    public boolean prime(int b) {
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

    public void showPrimeInArray() {
        m = 0;
        for (int i = 0; i < n; i++) {
            if (prime(a[i])) {
                test[m] = a[i];
                m++;
            }
        }
        if (m == 0) {
            System.out.println("Khong co so nguyen to trong mang");

        } else {
            System.out.println("So nguyen to lon nhat trong mang la: " + searchMax(test, m));
        }

    }
}
