public class Rectangle {
    private int x,y;
    private int width , height;
    public Rectangle(){
        this(0,0,1,1);
    }
    public Rectangle(int width, int height){
        this(0,0,width,height);
    }
    public Rectangle(int x, int y, int width, int height){ // yukaridaki thislerbu thise baglibu method
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);

    }
    public String toString(){
        return getX()+","+getY()+","+getWidth()+","+getHeight();
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public  int getWidth(){
        return width;
    }
    public  int getHeight(){
        return height;
    }

}
