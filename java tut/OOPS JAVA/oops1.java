class Employee {
    public int id;
    private int salary;
    public String name;

    public void set_Salary(int sal) {
        salary = sal;
    }

    public void get_details() {
        System.out.println("My id is " + id);
        System.out.println("MY name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id = 75;
        harry.name = "harry";
        harry.set_Salary(873);
        harry.get_details();
    }
}
