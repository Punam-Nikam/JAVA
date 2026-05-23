
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,7,4,5,6);
        // stream is basically a sequence of elements that can be processed in parallel or sequentially and it is used to perform some operations on the elements of the collection and it is introduced in java 8.

        // nums.stream(); //using stream we can perform some operations on the elements of the collection and it is used to perform some operations on the elements and it will not affect the original collection.
        /// if we once use stream then we cannot use it again because it will be closed and we need to create a new stream to perform some operations on the elements of the collection.
         
        ///Stream provides lots of methods to perform some operations on the elements of the collection like filter, map, reduce, collect etc .
        /// 
        Stream<Integer> s1 = nums.stream(); // creating a stream from the collection and it will not affect the original collection.
        Stream<Integer> s2=  s1.filter(n -> n%2 == 0);           //even
        Stream<Integer> s3 = s2.map(n -> n*2);                   //double evens
        
        int result = s3.reduce(0,(c,e) -> c+e);         //sum of double evens
        System.out.println(result);  //== 20

        // s3.forEach(n -> System.out.println(n));



        ///### more SIMPLIFIED AND ENHANCED
        int newresult = nums.stream() // creating a stream from the collection and it will not affect the original collection.
                            .filter(n -> n%2 == 0)              //even
                            .map(n -> n*2)                      //double evens
                            .reduce(0,(c,e) -> c+e);     //sum of double evens

        System.out.println(newresult);  //== 20



        //above all the things is same as
        // int sum=0;
        // for(int n : nums)
        // {
        //     if(n%2==0){          ///// evens 
        //         n= n*2;          ///// doubles of even
        //         sum += n;        /// sum of doubled evens
        //     }
        // }
        // System.out.println(sum); == 20

    }   
}
