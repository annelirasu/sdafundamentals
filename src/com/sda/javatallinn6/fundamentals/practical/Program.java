package com.sda.javatallinn6.fundamentals.practical;

import com.sda.javatallinn6.fundamentals.practical.model.Employee;
import com.sda.javatallinn6.fundamentals.practical.model.User;
import com.sda.javatallinn6.fundamentals.practical.service.EmployeeService;
import com.sda.javatallinn6.fundamentals.practical.util.Util;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to HR Console...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name and surname...");
        String nameSurname = scanner.nextLine();

        String name = Util.parseNameSurname(nameSurname)[0];
        String surName = Util.parseNameSurname(nameSurname)[1];
        User loggedUser = new User(name, surName);
        System.out.println("User : " + loggedUser + " connected...");



        while (true){

            System.out.println("What operation do you want to do? ");
            System.out.println("View(V)- Add(A) - Highest Salary(H) " +
                    "- Average Salary(AS) - Promote(P)" +
                    "- Increase Salary(I) - Exit(E)");

            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("E")) {
                break;
            }else if (operation.equalsIgnoreCase("V")) {
                Employee[] currentEmployees = EmployeeService.getCurrentEmployees();
                Util.printArray(currentEmployees);
            }else if(operation.equalsIgnoreCase("A")){
                System.out.println("Please provide Employee properties...");
                Employee employee = new Employee();

                System.out.println("Name:");
                String empName = scanner.nextLine();
                employee.setName(empName);

                System.out.println("Surname:");
                String empSurname = scanner.nextLine();
                employee.setSurname(empSurname);

                System.out.println("gender:");
                String gender = scanner.nextLine();
                employee.setGender(gender);

                EmployeeService.addNewEmployee(employee);
                Util.printArray(EmployeeService.getCurrentEmployees());
            }else if(operation.equalsIgnoreCase("H")){
                System.out.println("Highest salary is...");
                System.out.println(EmployeeService.findHighestSalary());
            }else if(operation.equalsIgnoreCase("AS")){
                System.out.println("Average salary...");
                System.out.println(EmployeeService.findAverageSalary());
            }else if(operation.equalsIgnoreCase("P")){
                System.out.println("Please provide Employee name...");
                String empName = scanner.nextLine();
                Employee emp = EmployeeService.findEmployeeByName(empName);
                EmployeeService.promote(emp);
                Util.printArray(EmployeeService.getCurrentEmployees());
            }

        }

    }

}
