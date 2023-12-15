public class Square extends Shape2D{
    Square(double height ,double width){
        super(height,width);
    }
    @Override
    public double getArea(){

        if(height==width) {
           return   Math.pow(width, 2);
        }
        return 0;
    }
    @Override
    public String toString(){
        return "The area of the square:"+getArea();
    }

}
