public class Cone extends Shape3D{
    Cone(double height , double radious){
        super(height,radious);
    }
    @Override
    public double getVolume(){
       return (double) 1 /3*Pi*Math.pow(radious,2)*height;
    }
    @Override
    public double getArea(){
        return Pi*radious*height;
    }
    @Override
    public String toString(){
        return "The volume of cone:"+getVolume()+"\nThe area of cone:"+getArea();

    }

}
