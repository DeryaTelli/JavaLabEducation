public class Sphere extends Shape3D{
    Sphere( double radious){
        super(radious);
    }
    @Override
    public double getVolume(){
        return ((double) 4 /3)*Pi*Math.pow(radious,3);
    }
    @Override
    public double getArea(){
        return Pi*radious*radious;
    }
    @Override
    public String toString(){
        return "The volume of sphere:"+getVolume()+"\nThe area of sphere:"+getArea();

    }
}
