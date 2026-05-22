
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  
{
// class Student  implements Comparable<Student>  ///comparable (interface) is used to sort the obects of the same class based on some property of that class
                //we need to remove comparatble then need to remove "" implements Comparable<Student> "" this and compareTo method and then we need to use comparator to sort the objects of the same class based on some property of that class and use comparator and using lambda expression to sort the objects of the same class based on some property of that class so we can use both comparable and comparator to sort the objects of the same class based on some property of that class but we need to remove one of them and then we can use the other one to sort the objects of the same class based on some property of that class  we can use both comparable and comparator to sort the objects of the same class based on some property of that class but we need to remove one of them and then we can use the other one to sort the objects of the same class based on some property of that class/////
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name= name;
    }
    
    public String toString() {
        return "Student [age=" +age + ", name=" +name + "]";
    }
    public int compareTo(Student that){ ////from this
        if(this.age > that.age)
            return 1;
        else
            return -1;
        
    }   //to this ..we can remove to avoid comparable and using comparaator.
}


public class ComparableDemo {
    public static void main(String[] args) {
        
        // Comparator<Student> com = new Comparator<Student>() {
        //     public int compare(Student s1, Student s2) {
        //         if(s1.age > s2.age)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };  / //////////////This using lambda expression

        Comparator<Student> com =(i, j) -> i.age > j.age ? 1: -1;

        List <Student> students = new ArrayList<>();

        students.add(new Student(20, "Alice"));
        students.add(new Student(25, "Bob"));
        students.add(new Student(18, "Charlie"));
        // nums.add(79);
        // nums.add(94);
        // nums.add(83);

        Collections.sort(students,com);
        for(Student s:students)
            System.out.println(s);


    }
}
