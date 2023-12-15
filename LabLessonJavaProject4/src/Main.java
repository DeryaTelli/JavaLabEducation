import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Worker[] workers = new Worker[3]; // 3 çalışanlık bir Worker dizisi oluşturuluyor

        for (int i = 0; i < workers.length; i++) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter salary: ");
                double salary = input.nextDouble();

                // Yeni Worker nesnesi oluşturulup diziye atanıyor
                workers[i] = new Worker(name, salary);
                if (workers[i].getSalary() < 0) {
                    throw new Exception("Salary amount must be greater than zero");
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            } finally {
                System.out.println("Done , Number of worker "+Worker.counter);
            }

        }



    }
}
