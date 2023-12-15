public enum Branch {
    MATH(100),
    PHYSICS(300),
    GEOMETY(400),
    ;
    private int fieldId;
     Branch(int fieldId){
         this.fieldId=fieldId;
     }
     public int getFieldId(){
         return this.fieldId;
     }
}
