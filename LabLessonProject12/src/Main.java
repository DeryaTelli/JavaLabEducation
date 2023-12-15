import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please select your degree;\n" +
                "1-Bachelor\n" +
                "2-Masters\n" +
                "3-PhD");
        System.out.print("Your choice: ");
        int selectId=input.nextInt();
        switch (selectId){
            case 1:
                System.out.print("Enter your school Number: ");
                int idB=input.nextInt();
                System.out.print("Enter your midterm score: ");
                float midB=input.nextFloat();
                System.out.print("Enter your final exam: ");
                float finB=input.nextFloat();
                Student bachelor=new BachelourStudent(idB,midB,finB);
                System.out.println("Score: "+bachelor.computeTotalScore());
                break;
            case 2:
                System.out.print("Enter your school Number: ");
                int idM=input.nextInt();
                System.out.print("Enter your midterm score: ");
                float midM=input.nextFloat();
                System.out.print("Enter your final exam: ");
                float finM=input.nextFloat();
                System.out.print("Enter your number of conf:");
                int confM=input.nextInt();
                Student masters=new MasterStudent(idM,midM,finM,confM);
                System.out.println("Score: "+masters.computeTotalScore());
                break;
            case 3:
                System.out.print("Enter your school Number: ");
                int idP=input.nextInt();
                System.out.print("Enter your midterm score: ");
                float midP=input.nextFloat();
                System.out.print("Enter your final exam: ");
                float finP=input.nextFloat();
                System.out.print("Enter your number of conf:");
                int confP=input.nextInt();
                System.out.print("Enter your number of articles");
                int articleP=input.nextInt();
                Student phds=new PhDStudent(idP,midP,finP,confP,articleP);
                System.out.println("Score: "+phds.computeTotalScore());
                break;
            default:
                System.out.println("Please enter valid value");
                break;
        }


    }


}

