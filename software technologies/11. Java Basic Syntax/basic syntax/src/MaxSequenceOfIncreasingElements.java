import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] input = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int position = 0;
        int nextPosition = 0;
        int lenght = 1;
        int bestLenght = 0;
        int bestPosition = 0;


        for (int i = 0; i < input.length; i++) {
            if (nextPosition >= input.length - 1) {
                break;
            } else {
                nextPosition++;
            }

            if (input[i] < input[nextPosition]) {
                lenght++;
                if (bestLenght < lenght) {
                    bestLenght = lenght;
                    bestPosition = position;
                }
            } else {
                position = nextPosition;
                lenght = 1;
            }
        }
        for (int i = 0; i < bestLenght; i++) {
            System.out.print(input[bestPosition + i] + " ");
        }

    }
}
