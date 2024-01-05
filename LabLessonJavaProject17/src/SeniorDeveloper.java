public class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour{
    SeniorDeveloper(String fullName , int id , double monthlySalary){
        super(fullName,id,monthlySalary);

    }
   @Override
    public double income(){
        return monthlySalary+getPromotion();
    }
    @Override
    public double getPromotion() {
        return 1.5*monthlySalary;
    }

    @Override
    public String toString(){
        return "Senior Develepor Promotion: "+getPromotion()+ " Income: "+income();
    }
}
