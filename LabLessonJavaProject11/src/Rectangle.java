public class Rectangle extends Shape2D {
    Rectangle(double height,double width){
        super(height,width);
    }

    @Override
    public double getArea() {
        return height*width;
    }
   @Override
   public String toString(){
        return "The area of the rectangle:"+getArea();
   }
}
