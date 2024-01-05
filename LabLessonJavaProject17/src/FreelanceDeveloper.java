public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour{
    int unitPrice;
    int hours;
    FreelanceDeveloper(String fullName, int id,int unitPrice,int hours){
        super(fullName,id);
        this.unitPrice=unitPrice;
        this.hours=hours;
    }
    @Override
    public double income(){
        return (hours*unitPrice)+getBonusSalary();
    }
    @Override
    public double getBonusSalary(){
        return hours*1.5;
    }

    @Override
    public String toString(){
        return "Freelance Develepor Bonus salary: "+getBonusSalary()+ " Income: "+income();
    }
}
