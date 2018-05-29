import java.awt.*;
import java.util.*;
import java.util.List;
public class Main {

         public static void main(String args[]) {
             Scanner in = new Scanner(System.in);
             System.out.print("Введите текст: ");
             String text = in.nextLine();


             List<String> words=new ArrayList<>(Arrays.asList(text.split(("[ ,]+")))); //делители только пробел и запятая
             System.out.printf("Количество слов в предложении: %s",words.size()+1);
             Collections.sort(words);
             for (String  word: words)
             {
                System.out.println(word);
             }

         }

}
