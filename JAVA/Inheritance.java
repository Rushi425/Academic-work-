// Base Class: Person
class Person {
    String name;
    String birthdate;
    int height;
    int weight;
    String address;

    // Constructor for Person class
    Person(String name, String birthdate, int height, int weight, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    // Method to calculate age (considering birth year only)
    int calculateAge(int currentYear) {
        String[] birthDateParts = birthdate.split("-");
        int birthYear = Integer.parseInt(birthDateParts[2]);
        return currentYear - birthYear;
    }
}

// Derived Class: Student
class Student extends Person {
    int rollNo;
    int[] marks;

    // Constructor for Student class
    Student(String name, String birthdate, int height, int weight, String address, int rollNo, int[] marks) {
        super(name, birthdate, height, weight, address);  // Call to parent class constructor
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate average marks
    double calculateAvg() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }
}

// Derived Class: Employee
class Employee extends Person {
    int empId;
    double salary;

    // Constructor for Employee class
    Employee(String name, String birthdate, int height, int weight, String address, int empId, double salary) {
        super(name, birthdate, height, weight, address);  // Call to parent class constructor
        this.empId = empId;
        this.salary = salary;
    }

    // Method to calculate tax (10% tax)
    double calculateTax() {
        return salary * 0.10;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("John Doe", "15-08-1990", 170, 70, "123 Street, City");
        System.out.println("Age of person1: " + person1.calculateAge(2024));

        // Creating a Student object
        int[] marks = {88, 92, 75, 85};
        Student student1 = new Student("Alice Smith", "10-05-2000", 160, 55, "456 Avenue, Town", 101, marks);
        System.out.println("Age of student1: " + student1.calculateAge(2024));
        System.out.println("Average Marks of student1: " + student1.calculateAvg());

        // Creating an Employee object
        Employee employee1 = new Employee("Bob Johnson", "25-12-1985", 175, 80, "789 Boulevard, City", 102, 50000);
        System.out.println("Age of employee1: " + employee1.calculateAge(2024));
        System.out.println("Tax for employee1: " + employee1.calculateTax());
    }
}

