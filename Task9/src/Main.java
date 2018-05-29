import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static List<Long> FindEven(String sequence){
        List<Long> arr=new ArrayList<>();
        for(int i=0;i<sequence.length();i++){
            arr.add(Long.parseLong(sequence.substring(i)));
        }
        return arr;
    }

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер последовательности: ");
            int N = in.nextInt();
            if(N<=0) throw new InputMismatchException();

            String sequence="";
            HashSet<Long> evenNumbers=new HashSet<>();

            for (int i=0;i<N;++i) {
                sequence+=i;
                if(i%2==0){
                evenNumbers.addAll(FindEven(sequence));
                }
            }
            
            System.out.println(evenNumbers);
            long sum = 0;
            for (long element:evenNumbers) {
                sum+=element;
            }
            System.out.printf("\nСумма всех чётных элементов: %s",sum);
        }
        catch (InputMismatchException e){

        }
    }
}
