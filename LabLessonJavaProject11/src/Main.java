import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter height:");
        double height=input.nextDouble();
        System.out.print("Enter width:");
        double width=input.nextDouble();
        System.out.print("Enter radious:");
        double radious=input.nextDouble();
        System.out.print("Enter depth:");
        double depth=input.nextDouble();
        Circle circle=new Circle(radious);
        Square square=new Square(height,width);
        Rectangle rectangle=new Rectangle(height,width);
        Cylinder cylinder=new Cylinder(height,radious);
        Sphere sphere=new Sphere(radious);
        Pyramid pyramid=new Pyramid((int)depth,(int)height,(int)width);
        Cone cone=new Cone(height,radious);
        Shape3D[] shape3D = new Shape3D[]{cylinder,sphere,pyramid,cone};
        for(Shape3D shape3Ds:shape3D){
            Shape2D[] shape2D = new Shape2D[]{circle,shape3Ds,square,rectangle};
            for(Shape2D shape2Ds: shape2D){
                System.out.println(shape2Ds.toString());
            }
        }




    }
}