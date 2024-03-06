package com.teachmeskills.hw18.task1.decision_logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class contains private constructor which does not allow creating objects of this class
 * contains static void method for creating a collection and filling it with random elements of type "Integer"
 * using “Stream”, duplicates are removed, only even elements are displayed, each element is multiplied by 2, the first four elements are sorted, the count of elements and the arithmetic mean of all numbers in the stream.
 */
public class DecisionLogic {
    private DecisionLogic() {

    }

    public static void logicImplementations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter collection size: ");
        if (scanner.hasNextInt()) {
            int collectionDimension = scanner.nextInt();
            if (collectionDimension <= 0) {
                System.out.println("re-Enter. Collection size cannot be 0 or a negative value");
            } else {
                List<Integer> numbers = new ArrayList<>(collectionDimension);
                for (int i = 0; i < collectionDimension; i++) {
                    int randomNumber = (int) (Math.random() * 10);
                    numbers.add(randomNumber);
                }
                List<Integer> integers1 = numbers.stream()
                        .sorted()
                        .distinct()
                        .toList();
                System.out.println("\nUnique elements of the collection: " + integers1);

                List<Integer> integers2 = numbers.stream()
                        .sorted()
                        .skip(7)
                        .filter(n -> n % 2 == 0)
                        .toList();
                System.out.println("\nAll even elements of the collection in the range from 7 to 17 (inclusive): " + integers2);

                List<Integer> integers3 = numbers.stream()
                        .sorted()
                        .map(n -> n * 2)
                        .toList();
                System.out.println("\nEach element of the collection multiplied by 2: " + integers3);

                List<Integer> integers4 = numbers.stream()
                        .sorted()
                        .limit(4)
                        .toList();
                System.out.println("\nThe first four elements of a sorted collection: " + integers4);

                System.out.println("\nNumber of elements in the stream: " + numbers.stream().count());

                double average = numbers.stream()
                        .mapToDouble(n -> n)
                        .average()
                        .orElse(Double.NaN);
                System.out.println("\nThe arithmetic mean of all numbers in the stream: " + average);
            }
        }
    }
}