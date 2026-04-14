// An array is a collection of similar data in contiguous memory locations referred by the same name
// Can be used to store data of primitive as well as reference types
// Holds a fixed number of values, determined at the time of array declaration
// Array index always starts from zero
// The length attribute of an array can be used to get its size
// Once initialized, the size of an array cannot be changed


public class Array {
 public static void main(String[] args) {
    
    int arr[]={2,3,4};
    int arr1[]=new int[5];

    System.out.println(arr[0]); //=2 (0th index value)

    //if we wanna change value of 3 to 6
    arr[1]=6;
    System.out.println(arr[1]);
 }   
}
