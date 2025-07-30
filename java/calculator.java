// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    int num1,num2,num3, operation;
    Scanner sc=new Scanner(System.in);
     
    
    public static void main(String[] args) {
         Main m=new Main();
        m.getoperation();
        //.getdata();
        m.performop(m);
        System.out.println("Try programiz.pro");
    }
    void getdata()
    {   
    System.out.println("enter num1");
    num1=Integer.parseInt(sc.nextLine());
    System.out.println("enter num2");
    num2=Integer.parseInt(sc.nextLine());
    }
    void Mul()
    {
        num3=num1*num2;
    }
    void Div()
    {
        num3=num1/num2;
    }
    void Add()
    {
    num3=num1+num2;
    }
    void Sub()
    {
     num3=num1-num2;
    }
    void display()
    {
        System.out.println("num3="+num3);
    }
    void getoperation()
    {
        System.out.println("1 Add");
                System.out.println("2 Sub");

            System.out.println("3 Mul");
            
            System.out.println("4 Div");        
         operation=Integer.parseInt(sc.nextLine());

    }
    void performop(Main m){
if(operation>4 || operation<1){
            System.out.println("Invalid input");

}else{
  m.getdata();  
}


if(operation==1)
        {
        m.Add();
        m.display();
        }
     if(operation==2)
        {m.Sub();
        m.display();
        }
        if(operation==3)
        {m.Mul();
        m.display();
        }
        if(operation==4)
        {m.Div();
        m.display();
    }

        
    }
    
}
  
  
