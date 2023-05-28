package lesson4_5_6;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassFromLessonFive {
    public static void main(String[] args) {
        ex0();
        //ex1();
        //System.out.println();
        //System.out.print(ex2(259));
        ex2();

    }

    private static void ex2() {
        //  2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
        List<String> namesList = List.of(
                "Иван", "Светлана", "Кристина", "Анна", "Анна", "Иван", "Петр", "Павел", "Петр", "Мария",
                "Марина", "Мария", "Мария", "Марина", "Анна", "Иван", "Петр", "Иван", "Анна", "Иван", "Петр", "Павел"
        );
        Map<String, Integer> namesMap= new HashMap<>();
        countNamesInMap(namesList, namesMap);
        System.out.println(namesMap);
        sortedPrintMap(namesMap);

        //ПРИМЕР СОРТИРОВКИ МАПА ПО ЗНАЧЕНИЯМ ПО ВОЗРАСТАНИЮ И ПО УБЫВАНИЮ ДЛЯ Integer

//        Map<String, Integer> sortedMap = namesMap.entrySet().stream()
//                .sorted(Comparator.comparingInt(e -> e.getValue()))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (a, b) -> { throw new AssertionError(); },
//                        LinkedHashMap::new
//                ));
//        Map<String, Integer> sortedMap = namesMap.entrySet().stream()
//                .sorted(Comparator.comparingInt(e -> -e.getValue()))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (a, b) -> { throw new AssertionError(); },
//                        LinkedHashMap::new
//                ));
//
//        sortedMap.entrySet().forEach(System.out::println);
    }

    private static void sortedPrintMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        for (String key : sortedMap.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, sortedMap.get(key));
        }
    }


    private static void countNamesInMap(List<String> list, Map<String, Integer> map) {
        int count = 1;
        for (String item: list){
            if (!map.containsKey(item)){
                map.put(item, count);
            } else{
                count = map.get(item);
                map.put(item, count+1);
                count = 1;
            }
        }
    }

    private static String ex2(int number) {
//        Написать метод, который переведет число из римского формата записи в арабский.
//        Например, 2022 = MMXXII
        Map<Integer, String> arabicToRomanConstMap = Map.ofEntries(
                Map.entry(1000, "M"),
                Map.entry(900, "CM"),
                Map.entry(500, "D"),
                Map.entry(400, "CD"),
                Map.entry(100, "C"),
                Map.entry(90, "XC"),
                Map.entry(50, "L"),
                Map.entry(40, "XL"),
                Map.entry(10, "X"),
                Map.entry(9, "IX"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(1, "I")
        );
        Map<Integer, String> arabicToRomanMap = new TreeMap<>(Comparator.reverseOrder());
        arabicToRomanMap.putAll(arabicToRomanConstMap);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : arabicToRomanMap.entrySet()){
            int arabic = entry.getKey();
            String roman = entry.getValue();
            while (number>=arabic){
                sb.append(roman);
                number-=arabic;
            }
        }
        return sb.toString();
    }

    private static void ex1() {
//        Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022

        Map<Character, Integer> signsMap = Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String inputStr = in.nextLine();
        int number = converterInputStr(inputStr, signsMap);
        System.out.printf("%s = %d", inputStr, number);

    }

    private static int converterInputStr(String str, Map<Character, Integer> stringIntegerMap) {
        int result = 0;
        int prewNum = -1;
        StringBuilder sb = new StringBuilder(str.trim()).reverse();
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (stringIntegerMap.get(str.charAt(i)) >= stringIntegerMap.get(str.charAt(i + 1)))
//                result += stringIntegerMap.get(str.charAt(i));
//            else result -= stringIntegerMap.get(str.charAt(i));
//        }
//        result += stringIntegerMap.get(str.charAt(str.length() - 1));
        for (Character sings : sb.toString().toCharArray()){
            int currentNum = stringIntegerMap.get(sings);
            if(currentNum<prewNum){
                currentNum*=-1;
            }
            result += currentNum;
            prewNum = currentNum;
        }

        return result;
    }

    private static void ex0() {
        Map<String, String> employeeMap = new HashMap<>(20);
        employeeMap.put("1223", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3456", "Сидоров");

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
        }

        for (String key : employeeMap.keySet()) {
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
        for (Integer key : testMap.keySet()) {
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
        for (Integer key : testMap2.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, testMap2.get(key));
        }
    }
}
