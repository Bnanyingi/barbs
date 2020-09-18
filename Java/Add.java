import java.util.InputMismatchException;
import java.util.Scanner;


public class Add {
    public static void main(String []args)throws InputMismatchException{
        int a = 0, b=0, sum;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers to be added : ");
        try{
            a =  sc.nextInt();
            sc.nextLine();
            b = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter an integer : ");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e);
        }
        sum = a+b;

        System.out.println(sum);
        sc.close();
    }
}
