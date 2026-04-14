import java.util.*;
public class CBSEPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of math: ");
        double math=sc.nextDouble();
        System.out.println("Enter marks of science: ");
        double science=sc.nextDouble();
        System.out.println("Enter marks of english: ");
        double english=sc.nextDouble();
        System.out.println("Enter marks of social science: ");
        double socialScience=sc.nextDouble();
        System.out.println("enter marks of hindi: ");
        double hindi=sc.nextDouble();
        System.out.println("Enter marks of computer science: ");
        double computerScience=sc.nextDouble();
        double totalMarks=math+science+english+socialScience+hindi+computerScience;
        double percentage=(totalMarks/600)*100;
        System.out.println("Percentage: "+percentage);
    }
}
