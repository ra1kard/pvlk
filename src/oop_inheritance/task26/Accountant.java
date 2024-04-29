package oop_inheritance.task26;

public class Accountant extends Employee {
    private int salary = payroll(80000);
    private String position = "Бухгалтер ";

    Accountant(String name, String surname, int workExperienceMonth) {
        super(name, surname, workExperienceMonth);
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int payroll(int salary) {
        int tempSalary = salary;
        if (super.getWorkExperience() >= 12) {
            for (int i = 0; i < super.getWorkExperience()/12; i++) {
                tempSalary += tempSalary/100*10;
            }
        }
        return tempSalary;
    }
}
