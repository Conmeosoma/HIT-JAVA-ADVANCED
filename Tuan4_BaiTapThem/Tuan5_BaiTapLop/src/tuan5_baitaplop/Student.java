// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitaplop;

public class Student {
    private String ten;
    private int tuoi;
    private String lop;

    public Student() {
    }

    public Student(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" + "ten=" + ten + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
    

}
