 enum Branch {
    MATH(
            "Mathematics professor always solves problems with unparalleled enthusiasm, leaving students in awe of the complexities of numbers and their applications."),
    PHYSICS("The Physics professor sparks curiosity with mind-bending experiments, unraveling the mysteries of the universe and igniting a passion for scientific exploration."),
    CS("The Computer Science professor navigates intricate coding challenges effortlessly, guiding students through the ever-evolving digital landscape."),
    ENG("The English professor paints vivid worlds through literature, weaving words into captivating stories that transport students to distant realms of imagination."),
    ;
   final private String describe;
    Branch(String describe){
       this.describe=describe;
    }
    public String getDescribe(){
        return this.describe;
    }

}
