class Calculator {
    int a;

    //create a method
    public int add(int n1){
        //actual variable=dummy(n1)
        a=n1;
        return a+2;  //here method is of int type so we need to ruturn a value..if we dont wanna return anything then we use void for the method as void add() {
        // sout("something print only or nothing");
        //}
    }
}


public class ClassObject {
    public static void main(String[] args) {

        //create object of class
        Calculator c=new Calculator();
        //call the method using reference variable c
        int sum=c.add(2);

        System.out.println("The add is :" +sum);
        System.out.println("Method is called after creating the object");
        
    }
}
