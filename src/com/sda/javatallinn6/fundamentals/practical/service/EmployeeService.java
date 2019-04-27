package com.sda.javatallinn6.fundamentals.practical.service;

import com.sda.javatallinn6.fundamentals.practical.model.Employee;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeService {

    public static int COUNT = 2;
    private static int INDEX = 0;
    private static Employee[] listOfEmployee = new Employee[COUNT];

    static{
        Employee employeeFirst = new Employee(1,"Feride","Celik","F",new Date(),"feride.celik@hr.com", BigDecimal.ZERO,false);
        Employee employeeSecond = new Employee(2,"Philly","Jones","M",new Date(),"philly.jones@hr.com", new BigDecimal(20000),false);
        listOfEmployee[INDEX] = employeeFirst;
        listOfEmployee[++INDEX] = employeeSecond;
    }


    public static Employee[] getCurrentEmployees(){
        return listOfEmployee;
    }

    public static Employee[] addNewEmployee(Employee employee){
        Employee[] copy = new Employee[listOfEmployee.length + 1];
        System.arraycopy(listOfEmployee, 0, copy, 0, listOfEmployee.length);
        COUNT++; INDEX++;
        copy[INDEX] = employee;
        listOfEmployee = copy;
        return listOfEmployee;
    }



    public static BigDecimal findHighestSalary(){
        BigDecimal result = listOfEmployee[0].getSalary();

        for (Employee employee:listOfEmployee) {
            if(employee.getSalary().compareTo(result) == 1){
                result = employee.getSalary();
            }
        }
        return result;
    }

    public static BigDecimal findAverageSalary(){
        BigDecimal result = BigDecimal.ZERO;
        for (Employee employee:listOfEmployee) {
            result = result.add(employee.getSalary());
        }
        return result.divide(BigDecimal.valueOf(listOfEmployee.length));
    }

    public static Employee findEmployeeByName(String name){
        Employee emp = null;
        for (Employee employee:listOfEmployee) {
            if(employee.getName().equalsIgnoreCase(name)){
                emp = employee;
                break;
            }
        }
        return emp;
    }
    public static void promote(Employee employee){
        if(employee != null){
            employee.setManager(true);
        }else{
            System.out.println("No employee found....");
        }
    }

}
