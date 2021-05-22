package com.app.dao.impl;

import com.app.dao.EmployeeDAO;
import com.app.dao.mapper.EmployeeRowMapper;
import com.app.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate template;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.template=new JdbcTemplate(this.dataSource);
    }


    @Override
    public Employee addEmployee(Employee employee) {
        String sql="insert into employee_schema.employee(name,age,contact,city,gender,deptid) values(?,?,?,?,?,?)";
        template.update(sql,employee.getName(),employee.getAge(),employee.getContact(),employee.getCity(),employee.getGender(),employee.getDeptid());
        return employee;

    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql="select id,name,age,contact,city,gender,deptid from employee_schema.employee";
        List<Employee> employeeList=template.query(sql,new EmployeeRowMapper());
        return employeeList;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String sql="UPDATE employee_schema.employee " +
                "SET \"name\"=?, age=?, contact=?, city=?, gender=?, deptid=? " +
                "WHERE id=?;";
        template.update(sql,employee.getName(),employee.getAge(),employee.getContact(),employee.getCity(),employee.getGender(),employee.getDeptid(), employee.getId());
        return employee;
    }

    @Override
    public void deleteEmployeeById(int id) {
        //fixme do this!

        String sql="DELETE FROM employee_schema.employee WHERE id=?;";

        template.update(sql,id);
        //return nothing


    }

    @Override
    public Employee getEmployeeById(int id) {
        String sql="select id,name,age,contact,city,gender,deptid from employee_schema.employee where id=?";
        Employee employee= template.queryForObject(sql,new Object[]{id},new EmployeeRowMapper());
        return employee;
    }

    @Override
    public List<Employee> getEmployeesByAge(int age) {
        String sql="select id,name,age,contact,city,gender,deptid from employee_schema.employee where age=?";
        List<Employee> employeeList=template.query(sql, new Object[]{age}, new EmployeeRowMapper());
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        //fixme WIP
        String sql="select id,name,age,contact,city,gender,deptid from employee_schema.employee where gender=?";
        List<Employee> employeeList=template.query(sql, new Object[]{gender}, new EmployeeRowMapper());
        return employeeList;
    }
}
