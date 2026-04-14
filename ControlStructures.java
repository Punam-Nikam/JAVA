
import java.util.Scanner;
public class ControlStructures {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=input.nextInt();

        if(age>=12 && age<=18)
           { 
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are adult");
        }
        if(age>=21 && age<=25) 
        {
            System.out.println("You are graduage");  
        }
        else if(age>=26 && age<=28) {
            System.out.println("You are post graduate");
        }
    }
}
