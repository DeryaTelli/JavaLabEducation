public class Movie implements Comparable<Movie> {
    private String name;
    private double rate;
    private int year;
     Movie(String name , double rate , int year){
        this.name=name;
        this.rate=rate;
        this.year=year;
    }

    public String getName(){
         return this.name;
    }
    public void setName(String name){
         this.name=name;
    }
    public double getRate(){
         return this.rate;
    }
    public void setRate(double rate){
         this.rate=rate;
    }
    public int getYear(){
         return this.year;
    }
    public void setYear(int year){
         this.year=year;
    }

    public String toString(){
         return "Name: "+getName()+"Rate: "+getRate()+"Year: "+getYear();
    }

    @Override
    public int compareTo(Movie o) {
        return getYear()-o.getYear();
    }

}
