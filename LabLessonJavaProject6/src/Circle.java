public class Circle {
    final static double pi=3.14;
    private int radius;

    Circle(int radius){
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius){
         this.radius=radius;
    }
    public double computeArea(){
        return pi*Math.pow(radius,2);
    }


}
