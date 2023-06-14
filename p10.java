import java.util.Scanner;

class Employee 
{
    protected int empId;
    protected String name;
    protected double salary;
    protected String address;
    public Employee(int empId, String name, double salary, String address) 
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee 
{
    private String dept;
    private String st;
    public Teacher(int empId, String name, double salary, String address, String dept, String st)
    {
        super(empId, name, salary, address);
        this.dept = dept;
        this.st = st;
    }
    public void display() 
    {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
        System.out.println("Department : " + dept);
        System.out.println("Subjects Taught : " + st);
        System.out.println("\n--------------------");
    }
}

public class p10 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of teachers : ");
        int n = s.nextInt();
        s.nextLine(); 
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Teacher " + (i + 1));
            System.out.println("Enter Employee ID : ");
            int empId = s.nextInt();
            s.nextLine(); 

            System.out.println("Enter Name : ");
            String name =s.nextLine();

            System.out.println("Enter Salary : ");
            double salary=s.nextDouble();
            s.nextLine(); 

            System.out.println("Enter Address: ");
            String address = s.nextLine();

            System.out.println("Enter Department : ");
            String dept= s.nextLine();

            System.out.println("Enter Subjects Taught : ");
            String st = s.nextLine();

            teachers[i] = new Teacher(empId, name, salary, address, dept, st);
        }

        System.out.println("\nTeacher Details:\n");
        for (Teacher teacher : teachers) 
        {
            teacher.display();
        }
    }
}
