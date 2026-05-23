import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class NewForEachMethod {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(4,9,6,3,7,1,2);


            // consumer is an interface that takes a single argument and returns no result it is used to perform some operation on the given argument and it is a functional interface so we can use lambda expression to implement it and it is used in forEach method to perform some operation on each element of the collection


    //    Consumer<Integer> con = new Consumer<Integer>() {
    //        public void accept(Integer n) {
    //            System.out.println(n);
    //        }
    //    };

    
     ///### USING LAMBDA EXPRESSION

    // Consumer<Integer> con = n -> System.out.println(n); // using lambda expression  
    // nums.forEach(con);


    /////## USING FOREACH METHOD    ===>>>    basically introduced in java 8 and it is used to iterate the elements of the collection and it takes a lambda expression as an argument
    nums.forEach(n -> System.out.println(n));
    }
}
