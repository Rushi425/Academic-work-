class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;
    Employee() 
    {
        this.firstName = "";
        this.lastName = "";
        this.monthlySalary = 0.0;
    }
    public void set(String firstName, String lastName, double monthlySalary) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = Math.max(monthlySalary, 0.0);
    }
    public void display()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    
    public double getYearlySalary()
    {
        return monthlySalary * 12;
    }

    
    public void raiseSalary(double percentage)
    {
        if (percentage > 0) {
            monthlySalary += (monthlySalary * percentage / 100);
        }
    }
}
public class Salary_increase
{
    public static void main(String[] args) 
    {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.set("John", "Doe", 3000.0);
        emp2.set("Jane", "Smith", 4000.0);
        System.out.println("Employee 1's Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2's Yearly Salary: " + emp2.getYearlySalary());

        
        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        
        System.out.println("Employee 1's Yearly Salary after 10% raise: " + emp1.getYearlySalary());
        System.out.println("Employee 2's Yearly Salary after 10% raise: " + emp2.getYearlySalary());
    }
}
 
