import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word=s.nextLine();

        char [] symbols=word.toCharArray();

        //97

        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i]+" -> "+(int)(symbols[i]-97));
        }
    }
}
