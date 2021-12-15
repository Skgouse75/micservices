package array;

public class Child extends Parent{

int a=100;
int b=200;
    void add(int i,int j)
     {
    System.out.println(i+j);
    System.out.println(this.a+this.b);// current class 
    System.out.println(super.a+super.b);
       }
  //// method with out super keyword  
   /* void m2()
    {
    m1();
    System.out.println("child class method");
    }
    void m3()
    {
    m1();
    System.out.println("child class method");
    m2();
    }
    public static void main(String[] args)
{
Child c=new Child();
c.add(1000,2000);
c.m3();
}*/
    
    
///////////----------------with super keyword--------------/////////////
    void m1()
    {
    System.out.println("child class method");
    }
    void m2()
    {
    this.m1();
    System.out.println("child class method");
    super.m1();
    }
    
    public static void main(String[] arhs)
    {
    Child c=new Child();
    c.m2();
    }


};
