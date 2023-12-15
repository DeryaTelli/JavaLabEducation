public class Main {
    public static void main(String[] args) {
        try{
            Time1 t1=new Time1(20,23,60);
            System.out.println(t1.toUniversalString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done");
        }
        System.out.println("The end of the program");
    }
}