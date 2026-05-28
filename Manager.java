import java.util.Scanner;

// Parent class
class Person {

    int id;
    String name;

    // Method to accept person details
    void acceptPerson() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person ID : ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Person Name : ");
        name = sc.nextLine();
    }

    // Method to display person details
    void displayPerson() {
        System.out.println("Person ID : " + id);
        System.out.println("Person Name : " + name);
    }
}

// Child class
class Manager extends Person {

    double salary;
    String department;

    // Method to accept manager details
    void acceptManager() {
        Scanner sc = new Scanner(System.in);

        // Calling parent class method
        acceptPerson();

        System.out.print("Enter Department : ");
        department = sc.nextLine();

        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
    }

    // Method to display manager details
    void displayManager() {

        // Calling parent class display method
        displayPerson();

        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }

    // Main method
    public static void main(String[] args) {

        Manager m = new Manager();

        m.acceptManager();

        System.out.println("\n--- Manager Details ---");
        m.displayManager();
    }
}