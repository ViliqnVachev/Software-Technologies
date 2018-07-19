import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split(" ");

        Map<String, String> phonebook = new TreeMap<>();
        String comand = "";

        while (!input[0].equals("END")) {
            comand = input[0];

            switch (comand) {
                case "A":
                    String name = input[1];
                    String phone = input[2];
                    if (phonebook.containsKey(name) == false) {
                        phonebook.put(name, phone);
                    } else {
                        phonebook.put(name, phone);
                    }
                    break;
                case "S":
                    name = input[1];
                    if (phonebook.containsKey(name) == false) {
                        System.out.printf("Contact %s does not exist.\n", name);
                    } else {
                        phone = phonebook.get(name);
                        System.out.printf("%s -> %s%n", name, phone);
                    }

                    break;
                case "ListAll":
                    for (Map.Entry<String, String> entry : phonebook.entrySet()) {

                        System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                    }
                    break;
            }
            input = s.nextLine().split(" ");
        }
    }
}

