package array;

import java.util.Scanner;

public class Test {

	//public static void main(String[] args) {
		
	
	/* {
	  Scanner sc = new Scanner(System.in);
	  int n, i = 1, sum = 0;
	  System.out.print("Enter a number: ");
	  n = sc.nextInt();
	  while (i < n) {
	   if (n % i == 0) {
	    sum = sum + i;
	   }
	   i++;
	  }
	  if (sum == n) {
	   System.out.print(i + " is a perfect number");
	  } else {
	   System.out.print(i + " is not a perfect number");
	  }
	 }
	}*/
	
	
//////////////////////////////////////////		
		/*static void software()
		{
		System.out.println("software solutions");
		}
		static void soft()
		{
		System.out.println("solutions");
		}
		public static void main(String[] args)
		{
		software();
		soft();
		}*/
/////////////////////////////////////////	
	//method calling
		
		/*void m1()
		{ m2();
		System.out.println("m1 ratan");
		}
		void m2()
		{ m3(100);
		System.out.println("m2 durga");
		  m3(200);
		}
		void m3(int a)
		{
		System.out.println(a);
		System.out.println("m3 naresh");
		}
		//public static void main(String[] args)
		{
		Test t=new Test();
		t.m1();
		
		}*/	
///////////////////////////////////////////////////////////////////////////
		
	/*	static int add(int a,int b)
		{
		int c=a+b;
		return c;
		}
		static float mul(int a,int b)
		{
		int c=a*b;
		return c;
		}
		//public static void main(String[] args)
		{
		int a=add(10,20);
		System.out.println(a);
		float b=mul(100,200);
		System.out.println(b);
		}*/
//////////////////////////////////////////////////////////////////////////////////////
		
	//method in method not support in java	
	/*	void m1()
		{
			
		void m2()
		{
		System.out.println("this ia a m2-static method");
		}
		System.out.println("this ia a m1-instance method");
		}
		public static void main(String[] args)
		{
		Test t1=new Test();
		t.m1();
		}*/	
		
////////////////////////////////////////////////////////
		
		
		/*void m1()
		{
		m2();
		System.out.println("m1 method");
		}
		void m2()
		{
		System.out.println("m2 method");
		}
		public static void main(String[] args)
		{
		Test t=new Test();
		t.m1();
		}
		};*/
		
//////////////////////////////////////////////////////	
	
	/*calling of static variables  
	 1.directly 2 with the class name  3 crating object and that obj referance*/
	

	/*static int x=100;
	public static void main(String[] args)
	{
	//1-way(directly possible)
	System.out.println(x);
	//2-way(By using class name)
	System.out.println(Test.x);
	//3-way(By using reference variable)
	Test t=new Test();
	System.out.println(t.x);
	}
}*/
	
////////////////////////////////////////////////////	
	
	/*int a=10;
	static int b=20;
	//public static void main(String... ratan)
	{
	
	Test t1=new Test();
	System.out.println(t1.a);//10
	System.out.println(t1.b);//20
	//t1.a=444;
	t1.b=555;
	Test t2=new Test();
	System.out.println(t2.a);//10
	System.out.println(t2.b);//555
	t2.b=111;
	System.out.println(t2.b);//111
	Test t3=new Test();
	System.out.println(t3.a);//10
	System.out.println(t3.b);//111
	Test t4=new Test();
	System.out.println(t4.a);//10
	System.out.println(t4.b);//111
	}*/

///////////////////////////////////////////////////////
/*public static void main(String[] args)
{
String str1="Rattaiah";
String str2="Durga";
System.out.println(str1);
System.out.println(str1+str2);
int a=10;
int b=20;
System.out.println(a);
System.out.println(b);
System.out.println(a+b);
}
}*/
//////////////////////////////////////////////////////////
	
	
	void m1()
	{
	System.out.println("m1-method");
	}
	void m2()
	{
	System.out.println("m1-method");
	}
public static void main(String[] args) {
	
	Test t=new Test();
	t.m1();
	t.m2();
}
}	
