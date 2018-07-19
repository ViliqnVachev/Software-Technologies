import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 2; i++) {
            char ch = s.nextLine().charAt(0);

            str.append(ch);
        }
       String out= str.reverse().toString();

        System.out.println(out);
    }
}
