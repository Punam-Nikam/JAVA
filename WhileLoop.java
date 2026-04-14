import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        //Guess the number x
        int count=1;
        while(x!=111){
            System.out.println("Enter value of x");
            x=sc.nextInt();
            count++;
        }
        System.out.println("You entered correct number after "+count+" Times");
    }
}
