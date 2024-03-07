public class Main {
    private static final Employee[] EMPLOYEE_BOOK = new Employee[10];


    public static void printEmployeeBook() {
        for (Employee employee : EMPLOYEE_BOOK) {
            System.out.println(employee);
        }
    }

    public static double getTotalSalary() {
        double totalSalary = 0;
        for (Employee salary : EMPLOYEE_BOOK) {
            totalSalary += salary.getSalary();
        }
        return totalSalary;
    }

    public static Employee findMaxSalary() {
        Employee employeeWithMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static Employee findMinSalary() {
        Employee employeeWithMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getSalary() <= minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static double getAverageSalary() {
        double totalSalary = 0;
        double averageSalary = 0;
        for (Employee salary : EMPLOYEE_BOOK) {
            totalSalary += salary.getSalary();
            averageSalary = totalSalary / EMPLOYEE_BOOK.length;
        }
        return averageSalary;
    }

    public static void printAllEmployee() {
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee != null) {
            }
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }

    public static void main(String[] args) {
        EMPLOYEE_BOOK[0] = new Employee("Иванов", "Иван", "Иванович", 1, 35_000);
        EMPLOYEE_BOOK[1] = new Employee("Петров", "Петр", "Петрович", 2, 40_000);
        EMPLOYEE_BOOK[2] = new Employee("Сидоров", "Иван", "Петрович", 3, 45_000);
        EMPLOYEE_BOOK[3] = new Employee("Сидоров", "Петр", "Иванович", 4, 50_000);
        EMPLOYEE_BOOK[4] = new Employee("Смольков", "Артем", "Игоревич", 5, 55_000);
        EMPLOYEE_BOOK[5] = new Employee("Лебедев", "Игорь", "Андреевич", 1, 37_500);
        EMPLOYEE_BOOK[6] = new Employee("Малышев", "Владислав", "Альбертович", 2, 42_500);
        EMPLOYEE_BOOK[7] = new Employee("Белов", "Юрий", "Сергеевич", 3, 47_500);
        EMPLOYEE_BOOK[8] = new Employee("Чернов", "Сергей", "Юрьевич", 4, 52_500);
        EMPLOYEE_BOOK[9] = new Employee("Пятнов", "Евгений", "Евгеньевич", 5, 57_500);

        printEmployeeBook();
        System.out.println("Общая сумма трат на зарплату составила " + getTotalSalary() + " рублей.");
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
        System.out.println("Средняя зарплата составила - " + getAverageSalary() + " рублей.");
        printAllEmployee();
    }
}
