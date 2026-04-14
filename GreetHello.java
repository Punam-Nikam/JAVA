import java.util.Scanner;
public class GreetHello {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello, "+name+"!");
        System.out.println("Have a great day dear!!");
        sc.close();
    }
}