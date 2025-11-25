// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package kiemtra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IEmployeeServiceImpl implements IEmployeeService {

    List<Employee> listEmployees;
    Scanner sc = new Scanner(System.in);

    public IEmployeeServiceImpl(List<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    IEmployeeServiceImpl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void add() {
        listEmployees.add(new Developer("1", "Tien", 20, 5000000, new Device("101", "ACER"), 7));
        listEmployees.add(new Developer("2", "Anh", 21, 6000000, new Device("102", "ASUS"), 8));
        listEmployees.add(new Developer("3", "Duc", 22, 7000000, new Device("103", "TUF"), 9));
        listEmployees.add(new Tester("4","Trang",18,20000000,new Device("104","DELL"),5));
        listEmployees.add(new Tester("5","Lan",31,5000000,new Device("105","DELL"),7));       
    }

    @Override
    public List<Employee> getAllEmployees() {
        return listEmployees;
    }

    @Override
    public Employee getEmloyeeById(String id) {
        boolean flag = false;
        for (Employee e : listEmployees) {
            if (e.getId().equalsIgnoreCase(id)) {
                System.out.println("Da tim thay nhan vien: " + e.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Khong tim thay nhan vien");
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employees = new ArrayList<>();
        boolean flag = false;
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        for (Employee e : listEmployees) {
            if (e.getName().equalsIgnoreCase(name)) {
                employees.add(e);
            }
        }
        
        return employees;
    }

}
