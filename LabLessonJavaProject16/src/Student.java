import java.util.Comparator;

public class Student implements Comparable <Student> {
    public int sNo;
    public int age;
    public String name;
    Student(int sNo, int age , String name){
        this.sNo=sNo;
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false; // .getClass class degiskeninin ne oldugu bilgisini getiriyordur
        return this.age==((Student)obj).age && this.sNo==((Student)obj).sNo && this.name==((Student)obj).name;
        // burda down casting yaptik cunku object turundeki objnin studen klasindaki methodlara erismesi gerekiyordu
    }

    public String toString(){
        return "age: "+age+" name: "+name+" no: "+sNo;
    }

    @Override
    public int compareTo(Student o) {
        if(age>o.age){
            return 1;
        }else if(age< o.age){
            return -1;
        }else{
            return 0;
        }
    }
}
