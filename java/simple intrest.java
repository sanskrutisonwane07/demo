// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    int si,r,p,t;
    
    Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Main m=new Main();
         m.getdata();
        
         m.simpleIntrest();
        m. display();
         
        
    }
    void getdata()
    {
        System.out.println("enter principal amount=");
        p=Integer.parseInt(sc.nextLine());
         System.out.println("enter rate =");
        r=Integer.parseInt(sc.nextLine());
     System.out.println("enter term =");
        t=Integer.parseInt(sc.nextLine());
    }
     void simpleIntrest()
     {
         si=p*r*t/100;
     }
     void display()
     {
     System.out.println("Simple intrest="+si);
     }
}