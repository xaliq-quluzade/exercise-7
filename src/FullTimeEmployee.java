public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int experience, double salary) {
        super(name, experience);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + this.getName() + '\'' +
                ", experience=" + this.getExperience() +
                ", salary=" + this.getSalary() +
                '}';
    }
}
