import java.util.Scanner;

class Member{
    String name;
    int age;
    int phone_number;
    String address;
    int salary;
    Scanner sc = new Scanner(System.in);
    public Member(){
        System.out.print("Enter name : ");
        name = sc.next();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter phone_number : ");
        phone_number = sc.nextInt();
        System.out.print("Enter address : ");
        address = sc.next();
        System.out.print("Enter salary : ");
        salary = sc.nextInt();
    }
    public void printSalary(){
        System.out.println("Salary : "+salary);
    }
    public void get(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+phone_number);
        System.out.println("Address : "+address);
        printSalary();
    }
}
class Employee extends Member{
    String specialization;
    String department;
    public Employee(){
        System.out.print("Enter our specialization : ");
        specialization = sc.next();
        System.out.print("Enter your department : ");
        department = sc.next();
    }
}
class Manager extends Member{
    String specialization;
    String department;
    public Manager(){
        System.out.print("Enter our specialization : ");
        specialization = sc.next();
        System.out.print("Enter your department : ");
        department = sc.next();
    }
}
public class Ch3Employee_Manager {
    public static void main(String[] args) {
        System.out.println("----------For Employee----------");
        Employee emp = new Employee();
        System.out.println("\n----------For Manager----------");
        Manager man = new Manager();
        System.out.println("\n\n----------Employee data----------");
        emp.get();
        System.out.println("\n----------Manager data----------");
        man.get();
    }
}
