package com.teachmeskills.hw18.task2.decision_logic;

import java.util.List;
import java.util.stream.Stream;

/**
 * Class contains private constructor which does not allow creating objects of this class
 * contains static void method for creating a collection with the values of the names of all students in the TMS_C27 onl group
 * using “Stream”, all values are converted to lowercase, values starting with "a" are selected, the collection of these values is sorted and the first element of this collection is displayed.
 */
public class DecisionLogic {
    private DecisionLogic() {

    }

    public static void logicImplementations() {
        List<String> students = Stream.of("Artem", "Alina", "Anastasiya", "Artem", "Nikita", "Oleg", "Ivan", "Kirill", "Ruslan", "Eugene", "Pavel", "Ruslan", "Aleksandr", "Daniil", "Aleksey", "Vladislav")
                .map(String::toLowerCase)
                .filter(str -> "a".contains(str.substring(0, 1)))
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase())
                .sorted()
                .limit(1)
                .toList();
        System.out.println(students);
    }
}
