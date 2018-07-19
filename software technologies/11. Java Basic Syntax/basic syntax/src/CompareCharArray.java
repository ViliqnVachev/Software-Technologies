import java.util.Scanner;

public class CompareCharArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] firstWord = s.nextLine().split(" ");
        String[] secondWord = s.nextLine().split(" ");

        boolean isEquals = false;
        boolean isFirst = false;
        boolean isSecond = false;
        int count = 0;

        if (firstWord.length == secondWord.length) {
            for (int i = 0; i < firstWord.length; i++) {
                if (firstWord[i].equals(secondWord[i])) {

                    count++;// sa ravni;
                } else {
                    String first = firstWord[i];
                    String second = secondWord[i];
                    char firstLetter = first.charAt(0);
                    char secondLetter = second.charAt(0);
                    if (firstLetter < secondLetter) {
                        isFirst = true;
                        break;
                    } else {
                        isSecond = true;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < Math.min(firstWord.length, secondWord.length); i++) {
                if (firstWord[i].equals(secondWord[i])) {

                    count++;
                } else {
                    String first = firstWord[i];
                    String second = secondWord[i];
                    char firstLetter = first.charAt(0);
                    char secondLetter = second.charAt(0);
                    if (firstLetter < secondLetter) {
                        isFirst = true;
                        break;// purviqt e po-golqm
                    } else {
                        isSecond = true;
                        break;
                    }
                }

            }
        }
        if (firstWord.length == secondWord.length && count == firstWord.length) {
            for (int i = 0; i < firstWord.length; i++) {
                System.out.print(firstWord[i]);
            }
            System.out.println();
            for (int i = 0; i < secondWord.length; i++) {
                System.out.print(secondWord[i]);
            }
        } else if (isFirst) {
            for (int i = 0; i < firstWord.length; i++) {
                System.out.print(firstWord[i]);
            }
            System.out.println();
            for (int i = 0; i < secondWord.length; i++) {
                System.out.print(secondWord[i]);
            }
        } else if (count == Math.min(firstWord.length, secondWord.length)) {
            if (firstWord.length == count) {
                for (int i = 0; i < firstWord.length; i++) {
                    System.out.print(firstWord[i]);
                }
                System.out.println();
                for (int i = 0; i < secondWord.length; i++) {
                    System.out.print(secondWord[i]);
                }
            } else {
                for (int i = 0; i < secondWord.length; i++) {
                    System.out.print(secondWord[i]);
                }
                System.out.println();
                for (int i = 0; i < firstWord.length; i++) {
                    System.out.print(firstWord[i]);
                }
            }
        } else if (isSecond) {
            for (int i = 0; i < secondWord.length; i++) {
                System.out.print(secondWord[i]);
            }
            System.out.println();
            for (int i = 0; i < firstWord.length; i++) {
                System.out.print(firstWord[i]);
            }
        }
    }
}





