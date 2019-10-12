package Lesson03;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] words = {
                "C#",
                "C++",
                "Chicken",
                "Android",
                "Ruby",
                "Java",
                "JavaFX",
                "JavaScript",
                "Orange",
                "Android",
                "Python",
                "Apple",
                "Orange",
                "Mac",
                "JavaFX",
                "PHP",
                "Ruby",
                "Python"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Шишкин", "79261231223");
        phoneBook.add("Петров", "78261234555");
        phoneBook.add("Петров", "79261237889");
        phoneBook.add("Курочкин", "79261231212");

        phoneBook.info();

        System.out.println(" У Петрова: " + phoneBook.get("Петров"));
    }

}