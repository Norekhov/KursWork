public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private double salary;
    private static int idCounter = 0;
    private final int id;

    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = ++idCounter;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return java.util.Objects.equals(surname, employee.surname) && java.util.Objects.equals(name, employee.name) && java.util.Objects.equals(patronymic, employee.patronymic);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), surname, name, patronymic);
    }

    @Override
    public String toString() {
        return "Фамилия - " + surname + ", имя - " + name + ", отчество - " + patronymic + ", отдел № " + department + ", зарплата - " + salary + ", порядковый номер - " + id;
    }

    public static void getEmployeeBook(Employee[] employeeBook) {
        for (int employee = 0; employee < employeeBook.length; employee++) {
            System.out.println(employeeBook[employee].toString());
        }
    }

    public static void getTotalSalary(Employee[] employeeBook) {
        double totalSalary = 0;
        for (Employee salary : employeeBook) {
            totalSalary += salary.getSalary();
        }
        System.out.println("Общая сумма трат на зарплату составила " + totalSalary + " рублей.");
    }

    public static void getMaxSalary(Employee[] employeeBook) {
        double maxSalary = Integer.MIN_VALUE;
        String employeeMaxSalary = "";
        for (Employee i : employeeBook) {
            if (i.getSalary() > maxSalary)
                maxSalary = i.getSalary();
            if (maxSalary == i.getSalary()) {
                employeeMaxSalary = i.getSurname() + " " + i.getName() + " " + i.getPatronymic();
            }
        }
        System.out.println("Сотрудник - " + employeeMaxSalary + " с максимальной зарплатой - " + maxSalary + " рублей.");
    }

    public static void getMinSalary(Employee[] employeeBook) {
        double minSalary = Integer.MAX_VALUE;
        String employeeMinSalary = "";
        for (Employee i : employeeBook) {
            if (i.getSalary() <= minSalary)
                minSalary = i.getSalary();
            if (minSalary == i.getSalary()) {
                employeeMinSalary = i.getSurname() + " " + i.getName() + " " + i.getPatronymic();
            }
        }
        System.out.println("Сотрудник - " + employeeMinSalary + " с минимальной зарплатой - " + minSalary + " рублей.");
    }

    public static void getAverageSalary(Employee[] employeeBook) {
        double totalSalary = 0;
        double averageSalary = 0;
        for (Employee salary : employeeBook) {
            totalSalary += salary.getSalary();
        }
        averageSalary = totalSalary / employeeBook.length;
        System.out.println("Средняя зарплата составила - " + averageSalary + " рублей.");
    }

    public static void getAllEmployee(Employee[] employeeBook) {
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
            }
        }
    }
}
