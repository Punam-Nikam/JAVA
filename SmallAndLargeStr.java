import java.util.*;

public class SmallAndLargeStr
{

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {

            String current = s.substring(i, i + k);

            // Compare for smallest
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            // Compare for largest
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
    }
}