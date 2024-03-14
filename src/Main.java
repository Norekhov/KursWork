import java.util.Arrays;

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
        return getTotalSalary() / EMPLOYEE_BOOK.length;
    }

    public static void printAllEmployee() {
        for (Employee employee : EMPLOYEE_BOOK) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }

    public static void getIndexSalary(double index) {
        for (Employee employee : EMPLOYEE_BOOK) {
            employee.setSalary(employee.getSalary() * index / 100 + employee.getSalary());
            System.out.println(employee);
        }
    }

    public static Employee getMinSalaryFromTheDepartment(Employee[] employees, int department) {
        Employee employeeWithMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment() && employee.getSalary() <= minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getMaxSalaryFromTheDepartment(Employee[] employees, int department) {
        Employee employeeWithMaxSalary = null;
        double minSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment() && employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getTotalSalaryFromTheDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment()) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double getAverageSalaryFromTheDepartment(Employee[] employees, int department) {
        int employeeInTheDepartment = 0;
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment()) {
                employeeInTheDepartment++;
            }
        }
        return getTotalSalaryFromTheDepartment(employees, department) / employeeInTheDepartment;
    }

    public static void getIndexSalaryFromTheDepartment(Employee[] employees, int department, int indexFromTheDepartment) {
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment()) {
                employee.setSalary(employee.getSalary() * indexFromTheDepartment / 100 + employee.getSalary());
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesFromTheDepartment(Employee[] employees, int department) {
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment()) {
                System.out.println("Фамилия - " + employee.getSurname() + ", имя - " + employee.getName() + ", отчество - " + employee.getPatronymic() + ", зарплата - " + employee.getSalary() + ", порядковый номер - " + employee.getId());
            }
        }
    }

    public static void printEmployeesFromTheDepartmentMinSalary(Employee[] employees, int department, int salaryFromTheDepartment) {
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment() && employee.getSalary() < salaryFromTheDepartment) {
                System.out.println("Фамилия - " + employee.getSurname() + ", имя - " + employee.getName() + ", отчество - " + employee.getPatronymic() + ", зарплата - " + employee.getSalary() + ", порядковый номер - " + employee.getId());
            }
        }
    }

    public static void printEmployeesFromTheDepartmentMaxSalary(Employee[] employees, int department, int salaryFromTheDepartment) {
        for (Employee employee : EMPLOYEE_BOOK) {
            if (employee.getDepartment() == department && department <= employee.getDepartment() && employee.getSalary() >= salaryFromTheDepartment) {
                System.out.println("Фамилия - " + employee.getSurname() + ", имя - " + employee.getName() + ", отчество - " + employee.getPatronymic() + ", зарплата - " + employee.getSalary() + ", порядковый номер - " + employee.getId());
            }
        }
    }


        public static void main (String[]args){
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
            System.out.println("");
            System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
            System.out.println("");
            System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
            System.out.println("");
            System.out.println("Средняя зарплата составила - " + getAverageSalary() + " рублей.");
            System.out.println("");
            printAllEmployee();
            System.out.println("");
            //повышенная сложность
            // индексация ЗП
            System.out.println("Проиндексированные ЗП:");
            double index = 30; //укажите процент индексации
            getIndexSalary(index);
            System.out.println("");

            //информация по отделам
            int department = 1;//введите номер отдела от 1 до 5
            System.out.println("Сотрудник из отдела № " + department + " с минимальной зарплатой: " + getMinSalaryFromTheDepartment(EMPLOYEE_BOOK, department));
            System.out.println("Сотрудник из отдела № " + department + " с максимальной зарплатой: " + getMaxSalaryFromTheDepartment(EMPLOYEE_BOOK, department));
            System.out.println("Общая сумма затрат на ЗП в отделе № " + department + " равна: " + getTotalSalaryFromTheDepartment(EMPLOYEE_BOOK, department) + " рублей.");
            System.out.println("Средняя ЗП в отделе № " + department + " равна: " + getAverageSalaryFromTheDepartment(EMPLOYEE_BOOK, department) + " рублей.");
            int indexFromTheDepartment = 20;//введите процент индексации
            System.out.println("После индексации, ЗП выглядит следующим образом:");
            getIndexSalaryFromTheDepartment(EMPLOYEE_BOOK, department, indexFromTheDepartment);
            System.out.println("Все сотрудники отдела № " + department + ":");
            printEmployeesFromTheDepartment(EMPLOYEE_BOOK, department);
            int salaryFromTheDepartment = 55_000;//введите интересующую ЗП
            System.out.println("Все сотрудники отдела № " + department + " с зарплатой меньше " + salaryFromTheDepartment + " рублей.");
            printEmployeesFromTheDepartmentMinSalary(EMPLOYEE_BOOK, department, salaryFromTheDepartment);
            System.out.println("Все сотрудники отдела № " + department + " с зарплатой больше " + salaryFromTheDepartment + " рублей.");
            printEmployeesFromTheDepartmentMaxSalary(EMPLOYEE_BOOK, department, salaryFromTheDepartment);
        }

    }
