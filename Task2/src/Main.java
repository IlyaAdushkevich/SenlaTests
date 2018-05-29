import java.util.Scanner;

public class Main {

    public static int Lcm(int num1,int num2) {
        return num1 / Gcd(num1, num2) * num2;
    }

    public static int Gcd(int num1,int num2){
        return num2 == 0 ? num1 : Gcd(num2,num1 % num2);
    }


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите первое целое число ");
            int num1 = in.nextInt();
            System.out.println("Введите второе целое число ");
            int num2 = in.nextInt();

            int gcd=Gcd(num1,num2);
            int lcm=Lcm(num1,num2);

            System.out.println("НОД равен "+gcd);
            System.out.println("НОК равен "+lcm);

            System.out.printf("Сумма чисел %d и %d равна ",num1,num2);
            System.out.println(num1+num2);

            System.out.printf("Разность чисел %d и %d равна 1",num1,num2);
            System.out.println(Math.abs(num1-num2));

            System.out.printf("Разность НОД и НОК равна "+Math.abs(gcd-lcm)+"\n");
            System.out.printf("Сумма НОД и НОК равна "+(gcd+lcm));

        }
        catch (java.util.InputMismatchException err){
            System.out.println("Было введено не целое число");
        }

    }
}
