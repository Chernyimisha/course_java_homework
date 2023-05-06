package homework;

import java.io.File;
import java.util.Objects;

public class DZ2 {
    public static void main(String[] args) {
        task1();
        task2("M:\\РАБОТА МИША\\Курс Python\\java_seminars\\java-practic20230413");
    }

    private static void task1() {

//        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Пример 1:
//        Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//        Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//        Пример 2:
//        Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//        Результат: SELECT * FROM USER;

        String request = "select * from students where ";
        String[] dist = new String[]{"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        String NULL = "'null'";
        StringBuilder sb = new StringBuilder();
        String temp = "";
        String result = "";
        for (String key : dist) {
            temp = "'" + key.substring(key.indexOf(":") + 1) + "'";
            if (!Objects.equals(temp, NULL)) {
                if (sb.length() == 0) {
                    sb.append(" WHERE ");
                } else sb.append(" and ");
                sb.append(key.substring(0, key.indexOf(":"))).append(" = ").append(temp);
            }
        }
        result = request.substring(0, request.indexOf("where") - 1).toUpperCase() + sb + ";";
        System.out.println(result);
    }

    private static void task2(String pathDir) {
//        Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
        File file = new File(pathDir);
        if (!((file.exists()) || file.isDirectory())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int number = 0;     // для печати номера по порядку
        String result = "";
        String[] filesNamesArr = file.list();
        for (int i = 0; i < filesNamesArr.length; i++) {
            number++;
            if (filesNamesArr[i].lastIndexOf(".") != -1 && filesNamesArr[i].lastIndexOf(".") != 0) {
                result = filesNamesArr[i].substring(filesNamesArr[i].lastIndexOf(".") + 1);
            }
            System.out.printf("%d Расширение файла: %s\n", number, result);
            result = "";
        }
    }
}
