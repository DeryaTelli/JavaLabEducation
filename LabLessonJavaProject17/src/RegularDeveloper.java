public class RegularDeveloper extends Developer{
    double monthlySalary;
    RegularDeveloper(String fullName, int id,double monthlySalary) {
        super(fullName, id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    double income() {
        return monthlySalary;
    }
    @Override
    public String toString(){
        return "Regular Developer Income: "+income();
    }
}
