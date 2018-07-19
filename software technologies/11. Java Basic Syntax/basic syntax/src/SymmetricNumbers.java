import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        int firstDigit = 0;
        int lastDigit = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 9) {
                System.out.print(i + " ");
            } else {
                boolean isSymetric = isSymetric(i);
                if (isSymetric) {

                    System.out.print(i + " ");
                }
            }
        }
    }

    private static boolean isSymetric(int number) {
        String numberAsString = Integer.toString(number);
        for (int i = 0; i <= numberAsString.length() / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

