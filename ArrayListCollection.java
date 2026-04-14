import java.util.*;
public class ArrayListCollection {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List <String> names=new ArrayList<>();

        names.add("Virat");
        names.add("Roheet");
        names.add("Vijaay");

        System.out.println(names);
        System.out.print("My Favourite :) ");
        System.out.println(names.get(0));
       }
}
