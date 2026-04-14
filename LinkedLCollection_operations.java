
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedLCollection_operations {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        LinkedList <String> city=new LinkedList<>();

        System.out.println("How many cities ? ");
        int n=Integer.parseInt(br.readLine());

        System.out.println("Enter" +n+ "cities : ");

        for(int i=0;i<n;i++){
            String s=br.readLine();
            city.add(s);
        }

        // String p=city.get(2);
        // System.out.println(p);    //obj.get() ->used for get specific value at the given index
 
        System.out.println("Cities are : ");
        for(String a:city){
            System.out.println(a);
        }
        
        //UPDATE
        System.out.println("Enter which and what string to update : ");
        int id=Integer.parseInt(br.readLine());
        String str=br.readLine();

        String b=city.set(id,str);
        System.out.println("Updated successfully..!");

        System.out.println("After update List is : "+city);
        
        //REMOVE 
        System.out.println("Enter index to remove city");
        int c=Integer.parseInt(br.readLine());

        city.remove(c);
        System.out.println("Removed Successfully.. ");

        System.out.println("After removing list is : "+city);
        

    }
}
