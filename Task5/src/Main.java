import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();
        System.out.print("Введите искомое слово: ");
        String word = in.nextLine().toLowerCase();
        long count = Arrays.stream(text.toLowerCase().split("[ ,.?!]+")).filter(word::equals).count();
        System.out.println(count);



    }
}
