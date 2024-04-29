package oop_polymorphism.test2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Boss(500));
        employees.add(new Manager());
        employees.add(new Manager());
        employees.add(new Security());
        employees.add(new Manager());

        for (Employee employee : employees) {
            employee.printName();
        }

        System.out.println(((Boss) employees.get(0)).getQuantityEmployees());
    }
}


class Employee{
    public void printName(){
        System.out.println("Я просто сотрудник");
    }
}


class Boss extends Employee{
    private Integer quantityEmployees;

    public Boss(Integer quantityEmployees) {
        this.quantityEmployees = quantityEmployees;
    }

    public Integer getQuantityEmployees() {
        return quantityEmployees;
    }

    @Override
    public void printName() {
        System.out.println("Я тут босс!");
    }
}


class Manager extends Employee{
    @Override
    public void printName() {
        System.out.println("Я простой менеджер");
    }
}


class Security extends Employee{}