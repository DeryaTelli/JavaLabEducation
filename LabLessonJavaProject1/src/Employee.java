public class Employee {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;
    Employee(String name, int socialSecurityNumber, float wage,int workingHours){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.wage=wage;
        this.workingHours=workingHours;
    }
     public void displayInfo(){
        System.out.println("Worker's name:"+name+"Security number:"+socialSecurityNumber);
     }

     public double displaySalary(){
        return wage*workingHours;
     }


}
