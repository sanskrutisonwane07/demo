// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class AreaOfCircle {
    float cir ,radius,area;
    Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        AreaOfCircle a = new AreaOfCircle() ;

   a.getRadius();
      // a.calculateArea();
       a.calculatecircumference();

    a.getdisplay();
}
void getRadius()
    {
        System.out.println("enter radius=");
        radius=Float.parseFloat(sc.nextLine());
    }
    void calculateArea()
    {
        area=3.14f*radius*radius;
    }
    void getdisplay()
    {
        System.out.println("cir="+cir);
    }
    void calculatecircumference()
    { 
        cir=2*3.14f*radius;
    }
}



