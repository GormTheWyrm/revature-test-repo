package org.example.main;

import io.javalin.Javalin;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.example.service.Impl.EmployeeServiceImpl;

import java.util.List;

public class Main {
//server



    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Javalin app = Javalin.create(config->config.enableCorsForAllOrigins()).
                start(9000);

        app.post("/employee", ctx -> {
            Employee employee = ctx.bodyAsClass(Employee.class);
            employee = service.createEmployee(employee);
            ctx.json(employee);
        });

        app.put("/employee", ctx -> {
            Employee employee = ctx.bodyAsClass(Employee.class);
            employee = service.updateEmployee(employee);
            ctx.json(employee);

        });

        app.get("/employee/:id", ctx -> {
            // Employee employee=ctx.bodyAsClass(Employee.class);
            Employee employee = service.getEmployeeById(Integer.parseInt(ctx.pathParam("id")));
            ctx.json(employee);
        });

        app.delete("/employee/:id", ctx -> {
            // Employee employee=ctx.bodyAsClass(Employee.class);
            int id = Integer.parseInt(ctx.pathParam("id"));
            service.removeEmployee(id);
            ctx.result("Employee with id " + id + " removed successfully");
        });


        app.get("/employees", ctx -> {
            List<Employee> employeeList = service.getEmployeesList();
            ctx.json(employeeList);
        });

        app.get("/employees/:age", ctx -> {
            List<Employee> employeeList = service.getEmployeesByAge(Integer.parseInt(ctx.pathParam("age")));
            ctx.json(employeeList);
        });

    }

}
