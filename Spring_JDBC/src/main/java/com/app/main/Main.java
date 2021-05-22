package com.app.main;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
        EmployeeDAO dao=(EmployeeDAO) context.getBean("employeeDAO");

//        List<Employee> employeeList=dao.getAllEmployees();
//        System.out.println("Printing all employees");
//        for(Employee e:employeeList){
//            System.out.println(e);
//        }

        Employee employee=new Employee("Big Red",37,7891911271L,"Sam Hill","F",100);
//        Employee employee2=new Employee(11,"Ash",23,7891211111L,"Mumbai","F",200);
        dao.addEmployee(employee);
        System.out.println(employee);

//        System.out.println("Employee added");
//        System.out.println(dao.getEmployeeById(12));

//        dao.updateEmployee(employee2);
//        List<Employee> employeeList2 = dao.getEmployeesByAge(34);
//        System.out.println(employeeList2);
        //do that prettier...
//        List<Employee> employeeList3= dao.getEmployeesByGender("F");
//        System.out.println(employeeList3);
//        dao.deleteEmployeeById(2); //this worked
//
//        List<Employee> employeeList2=dao.getAllEmployees();
//        System.out.println("Printing all employees");
//        for(Employee e:employeeList2){
//            System.out.println(e);
//        } //this did not show changes... must be within same transaction?!



    }
}
