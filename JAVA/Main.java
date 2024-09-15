import java.time.LocalDate;
import java.time.Period;

class Person {
    String name;
    LocalDate birthDate;
    float height;
    float weight;
    String address;

    // Constructor
    public Person(String name, LocalDate birthDate, float height, float weight, String address) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    // Method to calculate age
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // Display basic details of person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Address: " + address);
        System.out.println("Age: " + calculateAge() + " years");
    }
}

// Derived class Student
class Student extends Person {
    int rollNo;
    float marks;

    // Constructor
    public Student(String name, LocalDate birthDate, float height, float weight, String address, int rollNo, float marks) {
        super(name, birthDate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate average marks
    public float calculateAvg() {
        return marks / 5;  // Assuming 5 subjects
    }

    // Display student details
    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

// Derived class Employee
class Emp extends Person {
    int empId;
    float salary;

    // Constructor
    public Emp(String name, LocalDate birthDate, float height, float weight, String address, int empId, float salary) {
        super(name, birthDate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to calculate tax
    public float calculateTax() {
        return salary * 0.10f;  // Assuming 10% tax rate
    }

    // Display employee details
    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + calculateTax());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating and displaying Student object
        Student student = new Student("Alice", LocalDate.of(2000, 6, 15), 1.65f, 55.0f, "123 College St", 101, 450.5f);
        System.out.println("Student Details:");
        student.displayStudentDetails();

        System.out.println("\n");

        // Creating and displaying Employee object
        Emp employee = new Emp("Bob", LocalDate.of(1990, 4, 22), 1.75f, 70.0f, "456 Work Ave", 1001, 50000.0f);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
    }
}
