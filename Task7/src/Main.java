import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер списка: ");
            int N=in.nextInt();
            if(N<=0) throw new InputMismatchException();

            ArrayList<Double>arr = new ArrayList<>(N);

            for (int i=0;i<N;++i){
                arr.add(Math.random()*10);
            }
            Collections.sort(arr); //сортируем массив чтобы позиции нужных элементов были точно первыми и последними
                                   //а производительность пока что волнует мало

            int lastIndex = arr.size() - 1;
            System.out.printf("Наибольший элемент в списке %s",arr.get(lastIndex));
            System.out.printf("\nНаименьший элемент в списке %s ",arr.get(0));
        }
        catch (InputMismatchException e){
            System.out.println("Введено число неправильного формата");
        }
    }
}
