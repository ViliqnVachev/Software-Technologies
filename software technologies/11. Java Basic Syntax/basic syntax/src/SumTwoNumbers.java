import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.nextLine());
        double b = Double.parseDouble(s.nextLine());

        double result=a+b;
        System.out.println(result);
    }
}
