import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Xaliq", 3, 60000));
        employees.add(new PartTimeEmployee("Babek", 4, 20, 30));
        employees.add(new FullTimeEmployee("Cavid", 5, 70000));
        employees.add(new PartTimeEmployee("Dilare", 1, 25, 25));
        employees.add(new FullTimeEmployee("Elvira", 7, 80000));
        employees.add(new PartTimeEmployee("Ferhad", 5, 30, 20));
        employees.add(new FullTimeEmployee("Gunay", 2, 90000));
        employees.add(new PartTimeEmployee("Huseyn", 6, 35, 15));
        employees.add(new FullTimeEmployee("Ilqar", 1, 100000));
        employees.add(new PartTimeEmployee("Aylin", 4, 40, 10));

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getExperience() <= 2) {
                iterator.remove();
            }
        }

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        for (Employee e : employees) {
            System.out.println(e);
        }

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        };

        employees.sort(employeeComparator);

        HashMap<String, Double> employeeHashMap = new HashMap<>();

        employeeHashMap.put("maxSalary", employees.get(employees.size() - 1).getSalary());
        employeeHashMap.put("minSalary", employees.get(0).getSalary());

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        for (Map.Entry<String, Double> element : employeeHashMap.entrySet()) {
            System.out.println(element);
        }

    }
}