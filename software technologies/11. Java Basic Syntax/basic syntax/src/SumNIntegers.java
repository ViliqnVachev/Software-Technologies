import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        int result=0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s.nextLine());
            result+=a;
        }

        System.out.println("Sum= "+result);
    }
}
