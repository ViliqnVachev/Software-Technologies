import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String patern = "<upcase>(.+?)<\\/upcase>";

        Pattern r = Pattern.compile(patern);
        Matcher matcher = r.matcher(text);

        for (int i = 0; i < text.length(); i++) {
            if (matcher.find()) {
                text = text.replace(matcher.group(), matcher.group(1).toUpperCase());
            }
        }

        System.out.println(text);

    }
}
