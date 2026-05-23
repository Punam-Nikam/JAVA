
import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        
        // List<Integer> nums = new ArrayList<>();
        List<Integer> nums =Arrays.asList(4,9,6,3,7,1,2);

        ///@@ simple operations 
        // int sum=0;
        // for(int n : nums)
        // {
        //     if(n%2==0){
        //         n= n*2;
        //         sum += n;
        //     }
        // }
        // System.out.println(sum);

        //##### USING NORMAL FOR LOOP

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        //##### USING ENHANCED FOR LOOP

        // for(int n :nums)
        //    System.out.println(n);
        
        //##### USING FOREACH METHOD    ===>>>    basically introduced in java 8 and it is used to iterate the elements of the collection and it takes a lambda expression as an argument
        
        nums.forEach(n -> System.out.println(n));


    }
}
