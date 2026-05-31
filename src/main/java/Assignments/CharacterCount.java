package Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class CharacterCount {
    public static void main(String[] args) {

        String name = "YAzhmozhiSelvan".toLowerCase();

        // Store unique characters
        Set<Character> uniqueChars = new LinkedHashSet<>();
    //uniqueChars = y, a, z, h, m, o, i, s, e, l, v, n
        for (char ch : name.toCharArray()) {
            uniqueChars.add(ch);
        }

        // Count occurrences manually
        for (char ch : uniqueChars) {

            int count = 0;

            for (int i = 0; i < name.length(); i++) {

                if (ch == name.charAt(i)) {
                    count++;
                }
            }

            System.out.println(ch + " -> " + count);
        }
    }
}