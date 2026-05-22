import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  {
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name= name;
    }
    @Override
    public String toString() {
        return "Student [age=" +age + ", name=" +name + "]";
    }
}

public class ComparatorCompareToDemo {
    public static void main(String[] args) {
        
        Comparator <Student> com = new  Comparator<Student>() {
            public int compare(Student s1, Student s2){
                if(s1.name.compareTo(s2.name) > 0)
                    ////if(s1.age > s2.age)  //sort by age
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "Punam"));
        nums.add(new Student(22, "Akkuu"));
        nums.add(new Student(20, "Mauu"));
        nums.add(new Student(23, "Shubhi"));

        Collections.sort(nums,com);
        for(Student s:nums)
             System.out.println(s);

    }
}
