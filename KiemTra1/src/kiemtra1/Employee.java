// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package kiemtra1;

public abstract class Employee {

    String id;
    String name;
    int age;
    double basicSalary;
    Device device;
    static int employeeCount;
    final double BASE_SALARY_RATE = 500000;

    public Employee() {
    }

    public Employee(String id, String name, int age, double basicSalary, Device device) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.device = device;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", age=" + age + ", basicSalary=" + basicSalary + ", device=" + device + ", BASE_SALARY_RATE=" + BASE_SALARY_RATE + '}';
    }

    public double calculateSalary() {

        return basicSalary;
    }

}
