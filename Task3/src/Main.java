import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        StringBuilder word = new StringBuilder(in.next());
        String reverse = word.reverse().toString();
        System.out.printf("Является ли строка %s палиндромом? ",word);
        System.out.print(word.toString().equalsIgnoreCase(reverse));

    }
}
