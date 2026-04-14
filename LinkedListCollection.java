import java.util.LinkedList;
import java.util.Scanner;
class LinkedListCollection{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        LinkedList <String> cities=new LinkedList<>();

        System.out.println("Enter how many cities ? ");
        int n=sc.nextInt();
        
        System.out.println("Enter "+n+"cities");
        sc.nextLine();
        for(int i=0;i<n;i++){
            String c=sc.next();
            cities.add(c);
        }
        //System.out.println(cities);       //this will also work ,printed as [a,b,c]
        System.out.println("\nCities are : ");
        for(String a:cities)
            System.out.println(a); //foreach loop will print each city
        
        }

}