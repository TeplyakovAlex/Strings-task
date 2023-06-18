package TaskNumberThree;

import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNumberThree {
    public static void main(String[] args) { getOutput(nameQuantity(getAllName(),getName()));
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");

        return scanner.nextLine();

    }

    private static String getAllName() {

        String[] allName = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        StringBuilder stringBuilder = new StringBuilder();

        for (String name : allName) {

            stringBuilder.append(name);

        }

        return stringBuilder.toString();
    }


    private static String nameQuantity(String allName, String serchName) {
        Pattern pattern = Pattern.compile(serchName,
                Pattern.CASE_INSENSITIVE);

        // Ищем по шаблону
        Matcher mtch = pattern.matcher(allName);
        int quantity = 0;
        // Проверяем есть шаблон или нет
        // используя метод find()
        while (mtch.find())

            quantity++;

        return "Name is "+ serchName + "  appears in the list - " + Integer.toString(quantity) ;
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}





