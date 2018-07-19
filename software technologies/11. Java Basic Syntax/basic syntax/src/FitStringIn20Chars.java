import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();

        if (text.length() < 20) {
            text = padRight(text.length(), '*', text);
        } else if (text.length() > 20) {
            text=text.substring(0,20);
        }
        System.out.println(text);
    }

    private static String padRight(int i, char symbol, String text) {
        StringBuilder sb = new StringBuilder();
        int asteriskCount = 20 - i;
        for (int j = 0; j < asteriskCount; j++) {
            sb.append("*");
        }
        return text + sb.toString();
    }
}
