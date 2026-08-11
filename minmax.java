import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        long a[] = new long[5];
        long sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        Arrays.sort(a);

        System.out.println((sum - a[4]) + " " + (sum - a[0]));
    }
}