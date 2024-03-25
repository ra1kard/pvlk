package inheritance.task26;

public class Boss extends Employee {
    private int salary = payroll(150000);
    private String position = "Начальник ";

    Boss(String name, String surname, int workExperienceMonth) {
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
                tempSalary += tempSalary/100*15;
            }
        }
        return tempSalary;
    }
}
