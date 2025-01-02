class Employee {
    String name;
    int id;
    int salary = 22000;
    float bonus = 2.5f;
    boolean fireEmployeePermissions = false;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void getSalary() {
        System.out.println(name + " salary: " + salary);
    }

    void getBonus() {
        System.out.println(name + " bonus: " + (salary * bonus));
    }
}

class Manager extends Employee {

    Manager(String name, int id) {
        super(name, id);
        salary = 40000;
        bonus = 3.0f;
        fireEmployeePermissions = true;
    }

    @Override
    void getSalary() {
        System.out.println(name + " (Manager) salary: " + salary);
    }

    @Override
    void getBonus() {
        System.out.println(name + " (Manager) bonus: " + (salary * bonus));
    }
}

class Developer extends Employee {

    Developer(String name, int id) {
        super(name, id);
        salary = 50000;
        bonus = 3.0f;
    }

    @Override
    void getSalary() {
        System.out.println(name + " (Developer) salary: " + salary);
    }

    @Override
    void getBonus() {
        System.out.println(name + " (Developer) bonus: " + (salary * bonus));
    }
}

public class comp {
    public static void main(String[] args) {
        Employee emp = new Employee("jym", 101);
        emp.getSalary();
        emp.getBonus();

        Manager mgr = new Manager("Alex", 102);
        mgr.getSalary();
        mgr.getBonus();

        Developer dev = new Developer("Anke", 103);
        dev.getSalary();
        dev.getBonus();
    }
}
