public class Circle {
    final static double pi=3.14;
   private double radious;
   private String color;
    Circle(double radious,String color){
        setRadious(radious);
        setColor(color);
    }
    public double calculateArea(){
        return pi*Math.pow(radious,2);
    }

    @Override
    public String toString(){
        return "Circle of area: "+calculateArea()+" color: "+getColor()+ " radious: "+getRadious();
    }
    public double getRadious(){
        return this.radious;
    }
    public void setRadious(double radious){
        this.radious=radious;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }




}
