package controller;
import java.util.*;
import DAO.EmployeeDAo;
import model.Employee1;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAo dao = new EmployeeDAo();

        while (true) {
            System.out.println("\n1. Insert\n2. Update\n3. Delete\n4. Show All\n5. Exit");
            System.out.print("Choose Option: ");
            int ch = sc.nextInt();

            try {
                if (ch == 1) {
                    Employee1 emp = new Employee1();
                    System.out.print("Enter ID: ");
                    emp.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    emp.setName(sc.nextLine());
                    System.out.print("Enter Salary: ");
                    emp.setSalary(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    emp.setDepartment(sc.nextLine());
                    System.out.print("Enter City: ");
                    emp.setCity(sc.nextLine());
                    System.out.print("Enter Position: ");
                    emp.setPosition(sc.nextLine());
                    System.out.print("Enter Hire Date (YYYY-MM-DD): ");
                    emp.setHireDate(sc.nextLine());
                    System.out.print("Enter Email: ");
                    emp.setEmail(sc.nextLine());
                    System.out.print("Enter Address: ");
                    emp.setAddress(sc.nextLine());
                    System.out.print("Enter Company Name: ");
                    emp.setCompanyName(sc.nextLine());

                    int result = dao.insert(emp);
                    System.out.println(result + " record inserted.");

                } else if (ch == 2) {
                    System.out.print("Enter ID to Update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Employee1 emp = new Employee1();
                    emp.setId(id);
                    System.out.print("Enter Name: ");
                    emp.setName(sc.nextLine());
                    System.out.print("Enter Salary: ");
                    emp.setSalary(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    emp.setDepartment(sc.nextLine());
                    System.out.print("Enter City: ");
                    emp.setCity(sc.nextLine());
                    System.out.print("Enter Position: ");
                    emp.setPosition(sc.nextLine());
                    System.out.print("Enter Hire Date (YYYY-MM-DD): ");
                    emp.setHireDate(sc.nextLine());
                    System.out.print("Enter Email: ");
                    emp.setEmail(sc.nextLine());
                    System.out.print("Enter Address: ");
                    emp.setAddress(sc.nextLine());
                    System.out.print("Enter Company Name: ");
                    emp.setCompanyName(sc.nextLine());

                    int result = dao.update(emp);
                    System.out.println(result + " record updated.");

                } else if (ch == 3) {
                    System.out.print("Enter ID to Delete: ");
                    int id = sc.nextInt();
                    int result = dao.delete(id);
                    System.out.println(result + " record deleted.");

                } else if (ch == 4) {
                    List<Employee1> list = dao.getAllEmployees();
                    for (Employee1 e : list) {
                        System.out.println(e);
                    }

                } else if (ch == 5) {
                    System.out.println("Exit...");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
