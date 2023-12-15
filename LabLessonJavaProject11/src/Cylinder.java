public class Cylinder extends Shape3D{
    Cylinder(double height , double radious){
        super(height,radious);
    }
    @Override
    public double getVolume(){

        return Pi*Math.pow(radious,2)*height;
    }
    @Override
    public double getArea(){
        return 2*Pi*radious*(radious+height);
    }
    @Override
    public String toString(){
        return "The volume of cylinder:"+getVolume()+"\nThe area of cylinder:"+getArea();

    }



}
