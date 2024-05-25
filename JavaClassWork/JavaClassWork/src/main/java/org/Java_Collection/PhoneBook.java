package org.Java_Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        scanner.nextLine();


        Map<String, String> phoneBook = new HashMap<>();


        for (int pos = 0; pos < n; pos++) {
            String name = scanner.nextLine().trim();
            String phoneNumber = scanner.nextLine().trim();
            phoneBook.put(name, phoneNumber);
        }


        while (scanner.hasNextLine()) {
            String query = scanner.nextLine().trim();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
