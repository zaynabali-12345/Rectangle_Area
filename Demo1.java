class RectangleArea{
    int length,breadth;

    RectangleArea(int length,int breadth){
        this.length=length;
        this.breadth= breadth;
    }
    float calculateArea(){
        return length*breadth;
    }
    public void displayArea(){
        System.out.println("Area Of rectangle:"+calculateArea());
    }
}
class RectanglePerimeter{
     int length,breadth;

    RectanglePerimeter(int length,int breadth){
        this.length=length;
        this.breadth= breadth;
    }
    float calculateRPerimeter(){
        return 2*(length+breadth);
    }
    public void show(){
        System.out.println("Area Of rectangle:"+calculateRPerimeter());
    }
}

public class Demo1 {
    public static void main(String[] args) {
        
    RectangleArea r = new RectangleArea(2, 4);
    r.displayArea();
    
    RectanglePerimeter r1 = new RectanglePerimeter(4, 5);
    r1.show();
    }
}
