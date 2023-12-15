import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        try{
        int a= input.nextInt();
        System.out.println("Value:"+a);
        }catch (InputMismatchException e){
        System.out.println("Error: "+e.getMessage());
        }

    }
}