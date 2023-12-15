public class Worker {
     private String name;
    private double salary;
     static int counter=0;
    Worker(String name,double salary){
        this.name=name;
        this.salary=salary;
        Worker.counter ++;
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }}
