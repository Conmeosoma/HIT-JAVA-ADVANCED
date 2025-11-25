// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package kiemtra1;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester() {
    }

    public Tester( String id, String name, int age, double basicSalary, Device device,int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

//    public static int getEmployeeCount() {
//        return employeeCount;
//    }
//
//    public static void setEmployeeCount(int employeeCount) {
//        Employee.employeeCount = employeeCount;
//    }

    

    @Override
    public double calculateSalary() {
        return super.calculateSalary() +BASE_SALARY_RATE * bugsDetectedCount ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        super.toString();
        return "Tester{" + "bugsDetectedCount=" + bugsDetectedCount + '}';
    }
    

}
