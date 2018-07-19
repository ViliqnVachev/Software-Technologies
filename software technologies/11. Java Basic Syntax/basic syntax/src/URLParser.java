import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String protocol = "";
        String server = "";
        String resource = "";
        int index = -1;
        if (text.contains("://")) {
            index = text.indexOf("://");
            protocol = text.substring(0, index);
            text = text.substring(index + 3, text.length());
        }

        if (text.contains("/")) {
            index = text.indexOf("/");
            server = text.substring(0, index);
            text = text.substring(index , text.length());
        }else {
            server=text;
        }

        if (text.contains("/")) {
            text=text.substring(1,text.length());
            resource = text;
        }
        System.out.printf("[protocol] = \"%s\"%n",protocol );
        System.out.printf("[server] = \"%s\"%n",server );
        System.out.printf("[resource] = \"%s\"%n",resource );

    }
}
//http://www.abc.com/video
