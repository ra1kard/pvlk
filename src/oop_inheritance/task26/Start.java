package oop_inheritance.task26;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Boss boss = new Boss("Григорий", "Иванов  ", 36);
        Manager manager1 = new Manager("Наталья ", "Орешина ",24);
        Manager manager2 = new Manager("Марина  ", "Крутова ",10);
        Manager manager3 = new Manager("Любовь  ", "Веррато ",59);
        Accountant accountant = new Accountant("Ирина   ", "Ли      ",12);

        ArrayList<Employee> arrayList = new ArrayList<>(List.of(boss, manager1, manager2, manager3, accountant));

        /**
         * вывести имя, фамилию, должность, зп
         */
        printEmployees(arrayList);

        /**
         * найти среднюю зп
         */
        System.out.println("Средняя зп: " + findAverageSalary(arrayList));
        System.out.println();

        /**
         * вывести инфу о всех менеджерах, чья зп больше 50.000р
         */
        System.out.println("Менеджеры с зп больше 50.000р:");
        managerWithSalaryMore50k(arrayList);
    }

    /**
     * вывести имя, фамилию, должность, зп
     */
    public static void printEmployees(ArrayList<Employee> arrayList) {
        for (Employee employee : arrayList) {
            if(employee instanceof Boss) {
                System.out.print(((Boss)employee).getPosition() + " ");
                System.out.print(((Boss)employee).getSalary() + " ");
            } else if (employee instanceof Manager) {
                System.out.print(((Manager)employee).getPosition() + " ");
                System.out.print(((Manager)employee).getSalary() + " ");
            } else {
                System.out.print(((Accountant)employee).getPosition() + " ");
                System.out.print(((Accountant)employee).getSalary() + " ");
            }
            System.out.println(
                    employee.getName() + " " +
                    employee.getSurname() + " " +
                    "стаж мес: " + employee.getWorkExperience());
        }
        System.out.println();
    }

    /**
     * найти среднюю зп
     */
    public static int findAverageSalary(ArrayList<Employee> arrayList) {
        int sum = 0;
        for (Employee employee : arrayList) {
            if (employee instanceof Boss) {
                sum += ((Boss)employee).getSalary();
            } else if (employee instanceof Manager) {
                sum += ((Manager)employee).getSalary();
            } else {
                sum += ((Accountant)employee).getSalary();
            }
        }
        return sum/arrayList.size();
    }

    /**
     * вывести инфу о всех менеджерах, чья зп больше 50.000р
     */
    public static void managerWithSalaryMore50k(ArrayList<Employee> arrayList) {
        for (Employee employee : arrayList) {
            if (employee instanceof Manager && ((Manager) employee).getSalary() > 50000) {
                System.out.println(employee.getName() + " " + employee.getSurname());
            }
        }
    }

}
