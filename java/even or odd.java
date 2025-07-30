// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Number {
    int a;
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Number a=new Number();
        a.getdata();
        a.checkevenorodd();
    }
     void getdata()
     {
         System.out.println("Enter number=");
         a=Integer.parseInt(sc.nextLine());
     }
     void checkevenorodd()
     {
         if(a%2==0){
      System.out.println("even") ;
      }else{
          System.out.println("odd");
         }
     }
    }
    
    
