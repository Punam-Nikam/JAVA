class Person{
    int id;
    String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Manager extends Person {
    int salary;

    Manager(int id, String name,int salary){
        super(id,name);
        this.salary=salary;
    }

    void display() {
        System.out.println("Manager Detailes : ");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);

    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m=new Manager(1,"Virat Kohli",889999);
        m.display();
    }
}
