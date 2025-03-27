class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
} // menambahkan tanda '}' untuk menutup 'class Person'

class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        super(n, a); // memanggil constructor 'Person'
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary); // membetulkan tanda baca yang salah (',' harusnya ';')
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0); // membetulkan format nilai gaji yang salah 
        emp.display();
        emp.showSalary(); // menambahkan pemanggilan showSalary() agar mencetak informasi yang dibutuhkan
    }
}