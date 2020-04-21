class Rectangle{
    int len,width;
    public void getData(int x,int y){
        len=x;
        width=y;
    }
    int rectArea(){
       int Area;
        Area = len*width;
        return(Area);
    }
}
public class Access {
    public static void main(String args[]){
        int area1,area2;
        Rectangle rect=new Rectangle();
        rect.len=15;
        rect.width=20;
        
        area1=rect.len*rect.width;
         Rectangle rect2;
        rect2 = new Rectangle();
        rect2.getData(20,30);
        area2=rect2.rectArea();
        System.out.println("Area1="+area1);
        System.out.println("Area2="+area2);
    }
}
