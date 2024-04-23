package employee;

import java.util.*;

public class Main{

    static Scanner scan = new Scanner(System.in);

    static int n;

    static int id ;
    static String name;
    static int age ;
    static String department ;
    static String code ;
    static double salaryRate;

    public static void main(String[] args){
        Management manager = new Management();

        manager.Add(new Employee(1, "Kien", 20, "Marketing", "M1",1.1));
        manager.Add(new Employee(2, "Duc", 52, "IT", "IT",1));
        manager.Add(new Employee(3, "Bao", 20, "Marketing", "M1",1.5));
        manager.Add(new Employee(4, "Minh", 32, "Human Resource", "HR1",1.4));
        manager.Add(new Employee(5, "Tuan", 28, "IT", "IT",1.2));
        manager.Add(new Employee(6, "Linh", 40, "Marketing", "M2",1.8));
        manager.Add(new Employee(7, "Yen", 20, "IT", "IT1",2));
        manager.Add(new Employee(8, "Huyen", 12, "Human Resource", "HR2",1.6));
        manager.Add(new Employee(9, "Lam", 18, "IT", "IT",1.3));
        manager.Add(new Employee(10, "My", 22, "Human Resource", "HR2",1.9));

        do{
            System.out.println("1.Add Employee");
            System.out.println("2.Show Employees ");
            System.out.println("3.Delete Employee");
            System.out.print("Your select: ");
            n = scan.nextInt();

            switch (n) {
                case 1 :
                    AddEmployee();
                    manager.Add(new Employee(id, name, age, department, code,salaryRate));
                break;

                case 2:
                    System.out.println();
                    manager.Show();
                    System.out.println();
                break;

                case 3:
                    System.out.print("ID: ");
                    int id_to_del = scan.nextInt();
                    manager.Remove(id_to_del);
                break;
                default:
                    break;
            }
        }while(n != 0);
        scan.close();

    }

    private static void AddEmployee(){
        System.out.print("ID : ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.print("Name : ");
        name = scan.nextLine();
        System.out.print("Age : ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Department : ");
        department = scan.nextLine();
        System.out.print("Code : ");
        code = scan.nextLine();
        System.out.print("SalaryRate : ");
        salaryRate = scan.nextDouble();
    }
}