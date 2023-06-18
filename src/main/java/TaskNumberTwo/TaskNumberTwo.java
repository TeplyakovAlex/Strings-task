package TaskNumberTwo;

import java.util.regex.Pattern;

public class TaskNumberTwo {
    public static void main(String[] args){
        getOutput(getData(fixData(provideData())));}



    private static String[] provideData() {
        return new String[]{"orange","plum","tomato","onion","grape","onion"};
    }

// Оставил метод fixData, чтобы в массиве удалить onion-ы так сказать физически, а не номинально,
// хотя можно было просто вывести массив без них не затрагивая содержимое.
    private  static  String[] fixData(String[] Data){
        int count =0;
        for (String name: Data) {


            if (Pattern.matches("onion", name))

                Data[count]= null;
            count++;

        }   return  Data;}
        private static String getData(String[] Data) {

            StringBuilder stringBuilder = new StringBuilder();
            int count = 0;

            for (String name : Data) {

            if (name!=null){
                count++;
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }}

            return stringBuilder.toString();
        }
        private static void getOutput(String output) {
            System.out.println(output);



        }
}
