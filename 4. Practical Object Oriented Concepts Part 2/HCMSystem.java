import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private int employeeId;
    private String name;
    private String position;

    // Constructor
    public Employee(int employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + employeeId + ", Name: " + name + ", Position: " + position + "]";
    }
}

// Department Class
class Department {
    private int departmentId;
    private String name;
    private List<Employee> employees;

    // Constructor
    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Getter for departmentId
    public int getDepartmentId() {
        return departmentId;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to get the list of employees in the department
    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

// DepartmentFinder Class
class DepartmentFinder {
    private List<Department> departments;

    // Constructor
    public DepartmentFinder(List<Department> departments) {
        this.departments = departments;
    }

    // Method to find a department by its ID
    public Department find(int departmentId) {
        for (Department department : departments) {
            if (departmentId == department.getDepartmentId()) { // Use getter
                return department;
            }
        }
        return null;
    }
}

// Main Class for testing
public class HCMSystem {
    public static void main(String[] args) {
        // Step 1: Create some departments
        Department dept1 = new Department(1, "Engineering");
        Department dept2 = new Department(2, "HR");

        // Create a list of departments
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);

        // Create Department Finder
        DepartmentFinder finder = new DepartmentFinder(departments);

        // Step 2: Create a new employee
        Employee newEmployee = new Employee(101, "John Doe", "Software Engineer");

        // Step 3: Retrieve a specific department
        Department department = finder.find(1); // Assuming department ID 1 is for Engineering

        if (department != null) {
            // Step 4: Assign employee to the department
            department.addEmployee(newEmployee);

            // Step 5: Print the list of employees in the department
            List<Employee> employeesInDept = department.getEmployees();
            System.out.println("Employees in " + department.getName() + " Department: ");
            for (Employee emp : employeesInDept) {
                System.out.println(emp);
            }
        } else {
            System.out.println("Department not found.");
        }
    }
}
