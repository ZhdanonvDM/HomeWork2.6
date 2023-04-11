import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums2 = new ArrayList<>(List.of(1, 2, 5, 5, 7, 7, 3, 3, 6, 4));
        List<String> words = new ArrayList<>(List.of("первый", "второй", "первый", "третий", "второй", "третий", "десятый", "первый"));
        task1(nums);
        task2(nums2);
        task3(words);
        task4(words);
    }
    public static void task1 (List<Integer> numbers) {
        List<Integer> n = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                n.add(number);
            }
        }
        System.out.println("Задача № 1");
        System.out.println(n);
        System.out.println();
    }
    public static void task2 (List<Integer> numbers) {
        Collections.sort(numbers);
        Set<Integer> s = new HashSet<>(numbers);
        List<Integer> l = new ArrayList<>();
        for (Integer integer : s) {
            if (integer % 2 == 0) {
                l.add(integer);
            }
        }
        System.out.println("Задача № 2");
        System.out.println(l);
        System.out.println();
    }
    public static void task3 (List<String> words) {
        Set<String> w = new HashSet<>(words);
        System.out.println("Задача № 3");
        System.out.println(w);
        System.out.println();
    }
    public static void task4 (List<String> words) {
        Set<String> w = new HashSet<>(words);
        List<Integer> l = new ArrayList<>();
        for (String s : w) {
            int n = 0;
            for (String word : words) {
                if (s.equals(word)) {
                    n++;
                }
            }
            if(n>1) {
                l.add(n);
            }
        }
        System.out.println("Задача № 4");
        System.out.println("Количество повторов: " + l);
        System.out.println();
    }
}