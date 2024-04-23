package employee;

import java.util.*;


public class Management {
    Collection<Employee> employees = new ArrayList<>();

    public void Add(Employee employee) {
        employees.add(employee);
    }

    public boolean Remove(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    public void Show() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
