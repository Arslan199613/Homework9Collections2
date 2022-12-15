import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 2.1");

        Map<String, List<Integer>> human = new HashMap<>();
        List<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        human.put("Иван", number1);
        List<Integer> number2 = new ArrayList<>();
        number2.add(4);
        number2.add(5);
        number2.add(6);
        human.put("Сергей", number2);
        List<Integer> number3 = new ArrayList<>();
        number3.add(7);
        number3.add(8);
        number3.add(9);
        human.put("Петр", number3);

        Map<String, Integer> humans = new HashMap<>();
        for (Map.Entry<String, List<Integer>> m : human.entrySet()) {
            humans.put(m.getKey(), calculateValue(m.getValue()));

        }

        humans.entrySet().forEach(System.out::println);
        System.out.println("Задание 2.2- заполнить мапу, вывести по порядку");
        Map<Integer, String> journal = new LinkedHashMap<>();
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

    public static int calculateValue(List<Integer> list) {
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
}