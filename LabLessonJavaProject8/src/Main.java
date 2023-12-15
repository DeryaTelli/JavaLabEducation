import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Teacher mathT=new Teacher(1,Branch.MATH);
       Teacher physicT=new Teacher(2,Branch.PHYSICS);
       Teacher csT=new Teacher(3,Branch.CS);
       Teacher engT=new Teacher(4,Branch.ENG);
       Teacher[] teachers={mathT,physicT,csT,engT};

       for(Teacher teacher:teachers){
               System.out.println("Teacher" + teacher.getId() + "'s description: " + teacher.branch + "; "+teacher.branch.getDescribe());

       }

    }
}