import java.util.regex.Pattern;

public class TaskNumberOne {
    public static void main(String[] args){
        getOutput(getData(fixData(provideData())));}


    private static String[] provideData() {
        return new String[]{"brange", "plum", "tomato","onibn", "grape"};
    }



private  static  String[] fixData(String[] Data){
    int count =0;
        for (String name: Data) {



    if (Pattern.matches(".range", name)||Pattern.matches("orange", name)||Pattern.matches("o.ange", name)||Pattern.matches("or.nge", name)||Pattern.matches("ora.ge", name)
                ||Pattern.matches("oran.e", name)||Pattern.matches("orang.", name))

                    Data[count]= "orange";

    if (Pattern.matches(".lum", name)||Pattern.matches("plum", name)||Pattern.matches("p.um", name)||Pattern.matches("pl.m", name)||Pattern.matches("plu.", name))

                    Data[count]= "plum";

    if (Pattern.matches("tomato", name)||Pattern.matches(".omato", name)||Pattern.matches("t.mato", name)||Pattern.matches("to.ato", name)||Pattern.matches("tom.to", name)
            ||Pattern.matches("toma.o", name)||Pattern.matches("tomat.", name))

            Data[count]= "tomato";

     if (Pattern.matches("onion", name)||Pattern.matches(".nion", name)||Pattern.matches("o.ion", name)||Pattern.matches("on.on", name)||Pattern.matches("oni.n", name)
                    ||Pattern.matches("onio.", name))

                Data[count]= "onion";

     if (Pattern.matches("grape", name)||Pattern.matches(".rape", name)||Pattern.matches("g.ape", name)||Pattern.matches("gr.pe", name)||Pattern.matches("gra.e", name)
                    ||Pattern.matches("grap.", name))

                Data[count]= "grape";
            count++;

        }   return  Data;
    }
        private static String getData(String[] Data) {

            StringBuilder stringBuilder = new StringBuilder();
            int count = 0;

            for (String name : Data) {
                count++;
                // Застосування append()
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }

            return stringBuilder.toString();
        }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
