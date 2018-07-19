import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] input = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int bestPosition = 0;
        int bestTimes = 0;

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }

            if (bestTimes < count) {
                bestPosition = i;
                bestTimes = count;
            }

        }

        System.out.println(input[bestPosition]);
    }
}
