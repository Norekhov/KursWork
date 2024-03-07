public class Main {
    public static void main(String[] args) {
        Employee[] employeeBook = new Employee[10];
        employeeBook[0] = new Employee("Иванов", "Иван", "Иванович", 1, 35000);
        employeeBook[1] = new Employee("Петров", "Петр", "Петрович", 2, 40000);
        employeeBook[2] = new Employee("Сидоров", "Иван", "Петрович", 3, 45000);
        employeeBook[3] = new Employee("Сидоров", "Петр", "Иванович", 4, 50000);
        employeeBook[4] = new Employee("Смольков", "Артем", "Игоревич", 5, 55000);
        employeeBook[5] = new Employee("Лебедев", "Игорь", "Андреевич", 1, 37500);
        employeeBook[6] = new Employee("Малышев", "Владислав", "Альбертович", 2, 42500);
        employeeBook[7] = new Employee("Белов", "Юрий", "Сергеевич", 3, 47500);
        employeeBook[8] = new Employee("Чернов", "Сергей", "Юрьевич", 4, 52500);
        employeeBook[9] = new Employee("Пятнов", "Евгений", "Евгеньевич", 5, 57500);

        Employee.getEmployeeBook(employeeBook);
        Employee.getTotalSalary(employeeBook);
        Employee.getMaxSalary(employeeBook);
        Employee.getMinSalary(employeeBook);
        Employee.getAverageSalary(employeeBook);
        Employee.getAllEmployee(employeeBook);
    }
}