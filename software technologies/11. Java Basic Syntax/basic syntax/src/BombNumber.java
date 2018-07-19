import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> list = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] numbers = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bomb = numbers[0];
        int range = numbers[1];

        while (list.contains(bomb)) {
            int index = list.indexOf(bomb);

            int leftIndex = (index - range) < 0 ? 0 : (index - range);

            int rightIndex = (index + range) >= list.size() ? list.size() - 1 : (index + range);

            list.subList(leftIndex, rightIndex + 1).clear();
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
