import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 2.1");


        Map<String, List<Integer>> str1 = new HashMap<>();
        str1.put("Иван", List.of(1, 2, 3));
        str1.put("Костя", List.of(5, 7, 1));
        str1.put("Сергей", List.of(6, 2, 3));
        str1.put("Петр", List.of(8, 2, 3));
        str1.put("Олег", List.of(9, 2, 3));

        str1.replace("Иван", List.of(1 + 2 + 3));
        str1.replace("Костя", List.of(5 + 7 + 1));
        str1.replace("Сергей", List.of(6 + 2 + 3));
        str1.replace("Петр", List.of(8 + 2 + 3));
        str1.replace("Олег", List.of(9 + 2 + 3));

        for (Map.Entry<String, List<Integer>> human: str1.entrySet()) {
            System.out.println("Человек " + human.getKey() + ": " + human.getValue());

            System.out.println("Задание 2.2- заполнить мапу, вывести по порядку");

            Map<Integer, String> journal = new TreeMap<>();
            journal.put(1, "Сергей");
            journal.put(2, "Андрей");
            journal.put(3, "Василий");
            journal.put(4, "Петр");
            journal.put(5, "Иван");
            journal.put(6, "Олег");
            journal.put(7, "Влад");
            journal.put(8, "Сергей 2");
            journal.put(9, "Сергей 3");
            journal.put(10, "Сергей 4");

            for (Map.Entry<Integer, String> human2 : journal.entrySet()) {
                System.out.println("Человек " + human2.getKey() + ": " + human2.getValue());

            }

        }
    }
}


