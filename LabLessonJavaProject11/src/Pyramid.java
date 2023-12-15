public class Pyramid extends Shape3D{
    Pyramid(int depth ,int height, int width){
        super(depth,height,width);
    }
    @Override
    public double getVolume(){
        return (double) 1/3*depth*height*width;
    }
    @Override
    public double getArea(){
        return height*width+width*(Math.sqrt(Math.pow(depth,2)+Math.pow(height/2,2)))+height*Math.sqrt(Math.pow(height,2)+Math.pow(width/2,2));
    }
    @Override
    public String toString(){
        return "The volume of pyramid:"+getVolume()+"\n The area of pyramid:"+getArea();

    }
}
