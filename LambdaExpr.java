
// interface greeting{
//     void sayHello();
// }

// public class LambdaExpr {
//     public static void main(String[] args) {
        
//         greeting g=new greeting() {
//             public void sayHello(){
//                 System.out.println("Hellooow");
//             }
//         };
//         g.sayHello();
//     }
// }  
////////THIS IS THE MANUAL CODING WHERE THIS IS MANY LINES OF CODE
        /// HERE LAMBDA EXPRESSION IS INTRODUCED !! 
        /// Lambda expression is the short way to write ananymous function
        /// A Lambda Expression is an anonymous function — a block of code with no name, no class, that you can pass around like a value. Introduced in Java 8, it's the foundation of functional programming in Java.
        //Think of it as: shorthand for writing an anonymous class that implements a functional interface — in just one line.
        // WHERE IT IS THE CONCISE WAY TO IMPLEMET THE FUNCTIONAL INTERFACE WITHOUT CREATING SEPARATE CLASS OR ANANYMOUS CLASS
        /*Where is it Used?
            Collections / Streams
            Sorting
            Event Handling
            Thread / Runnable
            Comparator
            Optional
            forEach loops
            Filter / Map / Reduce */

// using lambda expression code

interface greeting{
    void sayHello();
}
public class LambdaExpr{
    public static void main(String[] args) {
        
        greeting g = () -> System.out.println("helloww"); //////this is lambda expression (shorter way of long code)
        g.sayHello();
    }
}