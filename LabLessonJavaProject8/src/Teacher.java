public class Teacher {
    private int id ;
    Branch branch;
    Teacher(int id , Branch branch){
        setId(id);
        this.branch=branch;
    }

    public int getId(){
        return id;
    }



    public void setId(int id){
        this.id=id;
    }


}
