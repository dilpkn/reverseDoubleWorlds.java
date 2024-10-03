package PROGA;

import java.io.*;
import java.util.StringTokenizer;
/*В тексте найти все пары слов, из которых одно является обращением другого.*/
public class SecondLesson {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = new String();
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка чтения с клавиатуры");
        }
        StringTokenizer str = new StringTokenizer(line, " ,.;:-!?");
        String first = null;
        while (str.hasMoreElements()) {
            String temp1 = str.nextToken();
            if (first != null) {
                String second = new StringBuilder(temp1).reverse().toString();
                if (first.compareToIgnoreCase(second) == 0) {
                    System.out.println(first);
                    System.out.println(temp1);
                }
            }
            first = temp1;
        }
    }
}
