package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NumberStorage {
    private final TreeSet<Integer> numbers;

    public NumberStorage() {
        numbers = new TreeSet<>();
    }

    public void add(int number) {
        numbers.add(number);
    }

    public void remove(int number) {
        numbers.remove(number);
    }

    public Integer findClosest(int target) {
        if (numbers.isEmpty()) {
            return null;
        }

        Integer lower = numbers.floor(target);
        Integer higher = numbers.ceiling(target);

        if (lower == null) {
            return higher;
        }
        if (higher == null) {
            return lower;
        }

        if (Math.abs(target - lower) <= Math.abs(target - higher)) {
            return lower;
        } else {
            return higher;
        }
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
