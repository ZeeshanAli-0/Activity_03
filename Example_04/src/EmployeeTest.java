import java.io.*;
public class EmployeeTest {
    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith\n ");
        Employee empTwo = new Employee("Mary Anne");
// Invoking methods for each object created
        empOne.empAge(21);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(5000);
        empOne.printEmployee();
        empTwo.empAge(44);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}

