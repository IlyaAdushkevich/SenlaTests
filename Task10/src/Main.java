import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));

        }
    }
// Задача сводится к поиску всех перестановок т.к не понятно, можно ли использовать один элемент множество раз
    public static void main(String[] args) {
        try {
            int[] num=new int[3];
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < 3; ++i) {
                System.out.printf("Введите %s-е число: ", i+1);
                num[i]=in.nextInt();
                if(num[i]<0 || num[i]>=10)throw new InputMismatchException();
            } //передаём в функцию String т.к с ним проще работать
            permutation("", Arrays.toString(num).replaceAll(", ", "").replace("[", "").replace("]", ""));
        }
        catch (InputMismatchException e) {
            System.out.println("Неверный ввод ");
        }
    }
}
