/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kiemtra1;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IEmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmloyeeById(String id);

    List<Employee> getEmployeeByName(String name);

}
