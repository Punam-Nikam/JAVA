import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        // for(int i=1;i<=5;i++){
        //     System.out.println(i);
        // }
        // System.out.println("1 to 5 series");

        ///Table 
        /// 
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++) {
            int table=i*n;
            System.out.println(n+" X "+i+" ="+ table);
        }
    }
}
