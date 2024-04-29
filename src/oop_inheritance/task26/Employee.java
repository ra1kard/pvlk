package oop_inheritance.task26;

public abstract class Employee {
    private String name;
    private String surname;
    private int workExperienceMonth;    //стаж работы в мес

    public Employee(String name, String surname, int workExperienceMonth) {
        this.name = name;
        this.surname = surname;
        this.workExperienceMonth = workExperienceMonth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWorkExperience() {
        return workExperienceMonth;
    }

    /**
     * метод расчета зп - считаем, что каждые 12 мес зп =+ 10%
     */
    public int payroll(int salary) {
        int tempSalary = salary;
        if (this.workExperienceMonth >= 12) {
            for (int i = 0; i < this.workExperienceMonth/12; i++) {
                tempSalary += tempSalary/100*10;
            }
        }
        return tempSalary;
    }

}
