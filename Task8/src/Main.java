import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int oddCount(String str) //считает количество палиндромов нечётной длины
    {int cntPalindromes=0;
        for(int indMiddle = 0; indMiddle < str.length(); ++indMiddle)
        {
            int leftBorder = indMiddle - 1, rightBorder = indMiddle + 1;
            while(leftBorder >= 0 && rightBorder < str.length() && str.charAt(leftBorder)== str.charAt(rightBorder))
            {
                ++cntPalindromes;
                --leftBorder;
                ++rightBorder;
                System.out.println(str.substring(leftBorder+1,rightBorder));
            }
        }
        return cntPalindromes;
    }

    public static int evenCount(String str)//считает количество палиндромов чётной длины
    {int cntPalindromes=0;
        for(int indMiddle = 0; indMiddle < str.length(); ++indMiddle)
        {
            int leftBorder = indMiddle, rightBorder = indMiddle + 1;
            while(leftBorder >= 0 && rightBorder < str.length() && str.charAt(leftBorder)==str.charAt(rightBorder))
            {
                ++cntPalindromes;
                --leftBorder;
                ++rightBorder;
                System.out.println(str.substring(leftBorder+1,rightBorder));
            }
        }
        return cntPalindromes;
    }

    /*  В задаче на поиск палиндромов я предполагал, что нам будет дана
        последовательность вида "1234567891011121314..." которая является единственной строкой
        и внутри неё нужно найти всевозможные палиндромы.
        Например в строке "151617" палиндромами будут являться "151", "161".
         */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер последовательности: ");
            int N = in.nextInt();
            String sequence="";
            if (N <= 0) throw new InputMismatchException();
            for (int i=0;i<N;++i){
            sequence+=i;
            }

          int cntPalindromes=oddCount(sequence)+evenCount(sequence);//т.к размер строки не превышает 100
                                                                  // достаточно использовать простой алгоритм поиска
            System.out.println("Количество всех палиндромов равно "+cntPalindromes);

        }
        catch (InputMismatchException e){
            System.out.println("введено неверный размер последовательности ");
        }
    }
}
