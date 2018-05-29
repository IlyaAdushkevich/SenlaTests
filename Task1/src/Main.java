import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++)
            if(num%i==0) return false;

        return true;
    }

    public static void main(String[] args) {
    try {
    Scanner in = new Scanner(System.in);

    System.out.println("Введите целое число ");
    int num = in.nextInt();
    System.out.printf("Является ли число %d чётным? ",num);
    System.out.println((num%2==0)+"\n");
    System.out.printf("Является ли число %d простым? ",num);
    System.out.print(isPrime(num));
    }
    catch (java.util.InputMismatchException err){
       System.out.println("Введено не целое число");
    }

    }
}
