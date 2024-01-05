public class Main {
    public static void main(String[] args) {
        RegularDeveloper rDev=new RegularDeveloper("Defne", 1,50.500);
        SeniorDeveloper sDev=new SeniorDeveloper("Derya",2,100.999);
        FreelanceDeveloper fDev=new FreelanceDeveloper("Ali",3,2500,6);
        System.out.println(rDev.toString());
        System.out.println(sDev.toString());
        System.out.println(fDev.toString());
    }
}