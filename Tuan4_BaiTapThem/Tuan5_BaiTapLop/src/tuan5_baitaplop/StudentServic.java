// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <

package tuan5_baitaplop;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServic {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> dsHocSinh = new ArrayList<>();
    public void add(){
        dsHocSinh.add(new Student("Tien",19,"CNTT02"));
        dsHocSinh.add(new Student("Tien1",195,"CNTT021"));
        dsHocSinh.add(new Student("Tien2",194,"CNTT022"));
        dsHocSinh.add(new Student("Tien3",192,"CNTT023"));
        dsHocSinh.add(new Student("Tien4",191,"CNTT024"));
    }

    public void xoa(){
        System.out.println("Nhap ten ban muon xoa: ");
        String ten = sc.nextLine();
        for(Student st: dsHocSinh){
            if(st.getTen().equalsIgnoreCase(ten)){
                dsHocSinh.remove(st);
            }
        }
        show();
    }
    public void show(){
        for(Student st : dsHocSinh){
            System.out.println(st.toString());
        }
    }
    public void searchByName(){
        boolean flag = false;
        System.out.println("Nhap ten ban muon tim: ");
        String ten = sc.nextLine();
        for(int i = 0  ; i < dsHocSinh.size();i++){
            if(dsHocSinh.get(i).getTen().equalsIgnoreCase(ten)){
                System.out.println(toString());
                flag = true;
               }
        }
        if(!flag){
            System.out.println("K thay ten");
        }
    }
    public void searchByClass(){
        boolean flag = false;
        System.out.println("Nhap ten lop hoc: ");
        String lop = sc.nextLine();
        for(int i = 0  ; i < dsHocSinh.size();i++){
            if(dsHocSinh.get(i).getLop().equalsIgnoreCase(lop)){
                System.out.println(toString());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("K thay");
                    
        }
        
    }
    
}
