public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private static int department;
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
}
