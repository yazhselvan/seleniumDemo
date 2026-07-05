package Assignments;

import java.util.*;

public class GroupByFirstLetter {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList(
                "java",
                "js",
                "python",
                "javascript",
                "robot",
                "pytest"
        );

        Map<Character, List<String>> map = new HashMap<>(); //key- value pair //Map creation

        for (String language : languages) { //javascript

            char firstLetter = language.charAt(0); //j

            if (!map.containsKey(firstLetter)) { //false
                map.put(firstLetter, new ArrayList<>());
            }

            map.get(firstLetter).add(language); //j - java,js,javascript
            //p - python
            //map.get(key-name).add(value for the key);
        }

        System.out.println(map);
    }
}