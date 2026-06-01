interface Prime {
    boolean check(int n);
}

public class LambdaPrime {
    public static void main(String[] args) {

        Prime p = n -> { 
            if (n <= 1) return false;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };

        int num = 18;

        if (p.check(num))
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}