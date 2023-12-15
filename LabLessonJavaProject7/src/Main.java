public class Main {

    public static void main(String[] args) {
        Branch[] brunches=Branch.values();
        for(Branch b: brunches){
            System.out.println(b.getFieldId());
        }
    }
}