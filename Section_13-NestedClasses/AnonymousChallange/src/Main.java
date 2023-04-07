import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/01/2018");
        Employee e2 = new Employee("Zickey", "Mouse", "02/01/2022");

        List<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(e1, e2));

        printOrderedList(listOfEmployees, "name");
        System.out.println();
        printOrderedList(listOfEmployees, "year");
    }

    public static void printOrderedList(List<Employee> eList, String sortField) {
        int currentYear = LocalDate.now().getYear();
        class MyEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                this.yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireData().split("/")[2]);
                this.fullName = String.join(" ", containedEmployee.first(), containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(this.fullName, this.yearsWorked);
            }
        }

        List<MyEmployee> listOfMyEmployees = new ArrayList<>();
        for(Employee e: eList) {
            listOfMyEmployees.add(new MyEmployee(e));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if(sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        listOfMyEmployees.sort(comparator);

        for(MyEmployee myEmployee: listOfMyEmployees) {
            System.out.println(myEmployee);
        }
    }
}