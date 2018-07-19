import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();

        boolean bool=Boolean.parseBoolean(input);
        if(!bool){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
