import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        for(int i=0; i<circles.length;i++){
            Scanner input =new Scanner(System.in);
            System.out.print("Enter value of radious:");
            int r=input.nextInt();
            circles[i]=new Circle(r);
        }
        for(Circle circle: circles){
            System.out.println("Circle areas: "+circle.computeArea());
        }
    }
}