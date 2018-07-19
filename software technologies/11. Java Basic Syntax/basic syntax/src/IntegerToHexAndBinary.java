import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String hex=Integer.toHexString(n).toUpperCase();
        String bin=Integer.toBinaryString(n);

        System.out.println(hex);
        System.out.println(bin);
    }
}
