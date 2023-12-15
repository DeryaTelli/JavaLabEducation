public abstract class Shape2D {
    protected final static double Pi=3.14;
    protected double height;
    protected double radious;
    protected double width;
    public Shape2D (double height , double width){
        this(0,height,width);
    }

    public Shape2D(double radious){
        this(radious,0,0);
    }

    public Shape2D(double radious,double height, double width){
        this.height=height;
        this.width=width;
        this.radious=radious;

    }
    public abstract double getArea();
    public abstract String toString();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
