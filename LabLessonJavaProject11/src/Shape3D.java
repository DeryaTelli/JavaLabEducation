public abstract class Shape3D extends Shape2D {
    protected double depth;
    Shape3D(int depth,double height, double width){
        this(0,width,height,depth);
    }
    Shape3D(double height,double radious){
        this(radious,0,height,0);
    }
    Shape3D(double radious){
        this(radious,0,0,0);
    }

    Shape3D(double radious, double width, double height, double depth){
        super(radious,height,width);
        this.depth=depth;
    }
    public abstract String toString();

    public abstract double getVolume();

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
