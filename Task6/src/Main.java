import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isRightTriangle(ArrayList<Double> x){
        Collections.sort(x);
        return (Math.pow(x.get(0),2)+Math.pow(x.get(1),2)==Math.pow(x.get(2),2));
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            ArrayList<Double>x=new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.printf("Введите длинну %d-й стороны треугольника: ", i + 1);
                x.add(in.nextDouble());
                if(x.get(i)<=0) throw new IllegalAccessException();
            }

            System.out.printf("Является ли треугольник со сторонами %s %s %s прямоугольным: "+isRightTriangle(x),x.get(0),x.get(1),x.get(2));
        }
        catch (java.util.InputMismatchException err){
            System.out.println("Введено число неправильного формата или введено вовсе не число");
            }

            catch (IllegalAccessException e) {
            System.out.println("Значение не может быть меньше или равно нулю");
        }

    }
}
