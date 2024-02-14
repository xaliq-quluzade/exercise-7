public class PartTimeEmployee extends Employee {
    private double hourlySalary;
    private double hoursWorked;

    public PartTimeEmployee(String name, int experience, double hourlySalary, int hoursWorked) {
        super(name, experience);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return this.hourlySalary * this.hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + this.getName() + '\'' +
                ", experience=" + this.getExperience() +
                ", salary=" + this.getSalary() +
                '}';
    }
}
