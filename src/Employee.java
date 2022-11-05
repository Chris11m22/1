public class Employee {
        private String name;
        private int department;
        private double salary;
        private int id;
        private static int count = 0;

        public Employee ( String name, int department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            id = count;
            count++;
        }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;

    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
            return id + ":" + " Ф.И.О " + name + " Отдел "+ department+ " Зарплата " + salary;
    }


}
