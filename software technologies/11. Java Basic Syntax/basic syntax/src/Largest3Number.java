import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Largest3Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numbers = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);
        int lenght = Math.min(3, numbers.length);

        for (int i = 0; i < lenght; i++) {
            System.out.println(numbers[numbers.length-1-i]);
        }
    }
}
