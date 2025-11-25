// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package kiemtra1;

public class Developer extends Employee implements IDebuggable, IWorkable {

    private int overtimeHours;

    public Developer() {
    }

    public Developer(String id, String name, int age, double basicSalary, Device device,int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

//    @Override
//    public int getEmployeeCount() {
//        return employeeCount;
//    }
//
//    @Overrides
//    public void setEmployeeCount(int employeeCount) {
//        this.employeeCount = employeeCount;
//    }

    @Override
    public String toString() {
        return super.toString() + "Developer{" + "overtimeHours=" + overtimeHours + '}';
    }
    

    
    

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + BASE_SALARY_RATE * overtimeHours; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

    }

    @Override
    public void fixBug() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
