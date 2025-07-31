class Student {
    int USN ;
    String Branch,Name;
    long phone;
    double percentage;
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Student a=new Student();
        a.getdata();
        a.display();
    }
    void getdata()
    {
     USN=2007;
     Name="Sanskruti";
     Branch="BCA";
     phone=567388474674L;
     percentage=67;
    }
    void display()
    {
      System.out.println("USN="+USN) ;
      System.out.println("Name="+Name);
      System.out.println("Branch="+Branch);
      System.out.println("phone="+phone);
      System.out.print("percentage="+percentage);
    }
    
}