/* ENCAPSULATION is the process of wrapping data(variables) and the methods that operates on the data together into a single unit called a class. and restricting direct access to the data from outside the class*/  //DATA HIDING AND CONTROLL ACCESS. 

// DATA HIDING == Declares all fiels private-so data prevent outside access..noboday can access data using (obj.dataVar)

// CONTROLLED ACCESS == Provide public void GETTER & SETTER methods these are only doors to the data ..we can write validation logic inside setters to control what values are allowed. (but methods in the same class so private data only accessible in the class and class methods only) 

/*WITHOUT Encapsulation — Dangerous
If fields are public, anyone can set any value — valid or invalid. There is no protection. Your data is completely exposed. 

WITH Encapsulation — Safe and Controlled
Fields are private. You control every access through methods. Validation logic lives in the setter — invalid values are rejected.
*/

class human {
    private int age;
    private String name; 


    public int getAge() {
        return age;
    }

    public void setAge(int a)
    {
        this.age=a;
    }

    public void setName(String n){
        this.name=n;
    }
    public String getName() {
        return name;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        human h=new human();
        h.setAge(25);
        int a=h.getAge();
        h.setName("neha");
        String b=h.getName();

        System.out.println(a +":"+ b);
    }
}
