package employee;
import java.util.*;

public class Employee {
    public int id;
    public String name;
    public int age;
    public String department;
    public String code;
    public double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setSalaryrate(double salaryrate){
        this.salaryRate = salaryRate;
    }


    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getDepartment() {
        return this.department;
    }
    public String getCode() {
        return this.code;
    }
    public double getSalaryrate(){
        return this.salaryRate;
    }


    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ID: ");
        setId(scan.nextInt());
        System.out.println("Name: ");
        setName(scan.next());
        System.out.println("Age: ");
        setAge(scan.nextInt());
        System.out.println("Department: ");
        setDepartment(scan.next());
        System.out.println("Code: ");
        setCode(scan.next());
        System.out.println("Salary Rate: ");
        setCode(scan.next());

    }

    public void output() {
        System.out.printf("ID: %-15s%n", getId());
        System.out.println("Name: %-15s%n" + getName());
        System.out.println("Age: %-15s%n" + getAge());
        System.out.println("Department: %-15s%n" + getDepartment());
        System.out.println("Code: %-15s%n" + getCode());
        System.out.println("Salary Rate: %-15s%n" + getSalaryrate());

    }

}
