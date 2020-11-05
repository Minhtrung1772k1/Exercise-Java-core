import java.util.Scanner;

public class App_test {
    public static void main(String[] args) {
        int totalEmployee = 0;
        Scanner scanner = new Scanner(System.in);
        totalEmployee = scanner.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(totalEmployee);
        employeeManagement.displayEmployee();
        System.out.println("\n\nThe employee has highest age: ");
        System.out.println(employeeManagement.getMaxAge().toString());
        System.out.println("\n\nMax salary: \n" + employeeManagement.getMaxSalary(true).toString());
        System.out.println("\n\nMin salary: \n" + employeeManagement.getMaxSalary(false).toString());
    }
}
