import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        String name=input.nextLine();
        System.out.print("Enter number of security:");
        int security=input.nextInt();
        System.out.print("Enter wage:");
        float wage=input.nextFloat();
        System.out.print("Enter working hours:");
        int hour=input.nextInt();
        Employee worker= new Employee(name,security, wage , hour);
        worker.displayInfo();
        System.out.println("Salary:"+worker.displaySalary());
    }
}