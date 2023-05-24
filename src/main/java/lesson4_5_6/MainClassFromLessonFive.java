package lesson4_5_6;

import java.util.HashMap;
import java.util.Map;

public class MainClassFromLessonFive {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        Map<String, String> employeeMap = new HashMap<>(20);
        employeeMap.put("1223", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3456", "Сидоров");

        for (Map.Entry<String, String> entry: employeeMap.entrySet()){
            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
        }

        for (String key: employeeMap.keySet()){
            System.out.printf("%s\t->\t%s%n", key, employeeMap.get(key));
        }

        employeeMap.forEach((key, value) -> {
            System.out.printf("%s\t->\t%s%n", key, value);
        });

        Map<Integer, String> testMap = Map.of(//до 11 элементов только
                12, "A",
                43, "B",
                65, "Y"
        );
        for (Integer key: testMap.keySet()){
            System.out.printf("%s\t->\t%s%n", key, testMap.get(key));
        }

        Map<Integer, Integer> testMap2 = Map.ofEntries(// более 10 элементов
                Map.entry(234, 235),
                Map.entry(237, 2735),
                Map.entry(23764, 236765),
                Map.entry(2364, 2345),
                Map.entry(23454, 2385),
                Map.entry(24334, 23435),
                Map.entry(23344, 23544),
                Map.entry(23674, 23735),
                Map.entry(23314, 23445),
                Map.entry(23384, 2345),
                Map.entry(23774, 25735),
                Map.entry(23574, 23575)
        );
        for (Integer key: testMap2.keySet()){
            System.out.printf("%s\t->\t%s%n", key, testMap2.get(key));
        }
    }
}
