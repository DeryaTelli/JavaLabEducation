public class Circle extends Shape2D{
    Circle (double radious){
        super(radious);
    }
    @Override
    public double getArea(){
        return Math.pow(radious,2)*Pi;
    }
    @Override
    public String toString(){
        return "The area of the circle: "+getArea();
    }
}
