public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Соловьева Людмила Никоваевна", 1, 95465);
        employees[1] = new Employee("Ширин Андрей Александрович", 1, 75346.12);
        employees[2] = new Employee("Воронова Екатерина Игоревна", 2, 76489);
        employees[3] = new Employee("Мальцев Иван Андреевич", 2, 89765.34);
        employees[4] = new Employee("Гомзяков Никита Игоревич", 3, 56897);
        employees[5] = new Employee("Гомзякова Кристина Игоревна", 3, 65789.31);
        employees[6] = new Employee("Трофимова Ольга Сергеевна", 4, 56743);
        employees[7] = new Employee("Малинин Геннадий Александрович", 4, 87654.45);
        employees[8] = new Employee("Гилев Денис Александрович", 5, 76890);
        employees[9] = new Employee("Злобина Дарья Валерьевна", 5, 61234.04);
        printArray();
        System.out.println("Cумма затрат на зарплаты в месяц " + salaruSum());
        System.out.println("Cотрудник с минимальной зарплатой " + findMinSalary());
        System.out.println("Cотрудник с максимальной зарплатой " + findMaxSalary());
        System.out.println("Среднее значение зарплат " + middleSalary());
        printfullNames();


    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double salaruSum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee minSalary = employees[0];
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
            return minSalary;
        }
    public static Employee findMaxSalary() {
        Employee maxSalary = employees[0];
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
               maxSalary = employees[i];
            }
        }
        return maxSalary;
    }
    public static double middleSalary() {
        int counter = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    counter++;
                }
            }
            return salaruSum()/ counter ;
        }
        public static void printfullNames() {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    System.out.println(employees[i].getName());
                }
            }



}
    }











