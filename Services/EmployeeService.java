package SeminarsOOP.StudentApp.Services;


import SeminarsOOP.StudentApp.Domen.Employee;
import SeminarsOOP.StudentApp.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonServices<Employee> {
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee epls = new Employee(name, age, "basic");
        count++;
        employees.add(epls);
    }

    public void sortByFIO() {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
}