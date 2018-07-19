import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n=s.nextLine();
        int number=Integer.parseInt(n,16);
        System.out.println(number);
    }
}
