import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text=s.nextLine();
        char[]ch=text.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = ch.length-1; i >=0 ; i--) {
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());
    }
}
