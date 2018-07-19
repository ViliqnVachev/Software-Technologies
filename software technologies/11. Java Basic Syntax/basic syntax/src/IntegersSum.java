import java.util.Arrays;
import java.util.Scanner;

public class IntegersSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] input = Arrays.stream(s.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (Math.min(a,b) + Math.max(a,b) == c) {
            System.out.printf("%d + %d = %d", Math.min(a,b), Math.max(a,b), c);
        } else if (Math.min(b,c) + Math.max(b,c)  == a) {
            System.out.printf("%d + %d = %d", Math.min(b,c), Math.max(b,c), a);
        } else if (Math.min(a,c) + Math.max(a,c)  == b) {
            System.out.printf("%d + %d = %d", Math.min(a,c), Math.max(a,c), b);
        }else {
            System.out.println("No");
        }
    }
}
