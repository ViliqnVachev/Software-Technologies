import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String email = s.nextLine();

        String user = email.split("@")[0];
        String replacment=gerReplace(user.length(),'*',email);

        String text = s.nextLine();

        text=text.replaceAll(email,replacment);
        System.out.println(text);
    }

    private static String gerReplace(int length, char c, String email) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(c);
        }
        String user = email.split("@")[0];
        return email.replaceFirst(user,sb.toString());
    }
}
