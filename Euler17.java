import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sun.rmi.server.Util;

/**
 *
 * @author Mandeep Raj Shrestha
 */
public class Euler17 {

    private static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        map.put(100, "hundred");
    }

    ;

        public static void main(String[] args) {
        Num2.simple();
        Num2.extended();
    }

    public static void simple() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 100) {
                String word = process(i);
                word = word.trim();
                count += word.length();
            } else {
                count += 10;
            }
        }
        System.out.println(count);
    }

    public static void extended() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            String hundreds = processHundreds(i);
            int x = i % 100;
            String processedString = "";
            String word = process(x);
            if (hundreds == null || hundreds.equals("")) {
                processedString = word;
            } else {
                if (word == null || word.equals("")) {
                    processedString = hundreds;
                } else {
                    processedString = hundreds + "and" + word;
                }
            }
            processedString = processedString.trim();
            count += processedString.length();
        }
        System.out.println(count);

    }

    private static String processHundreds(int i) {
        int pos = i / 100;
        String processedString = "";
        if (pos > 0) {
            String pre = map.get(pos);
            String post = map.get(100);
            processedString = pre + post;
        }
        return processedString;
    }

    private static String process(int i) {
        String word = "";
        if (i > 0) {
            word = map.get(i);
            if (word == null) {
                int tenthPlace = i / 10;
                int unitPlace = i % 10;
                String tenthString = map.get(tenthPlace * 10);
                String unitString = map.get(unitPlace);
                word = tenthString + unitString;
            }
        }
        return word;
    }

}
