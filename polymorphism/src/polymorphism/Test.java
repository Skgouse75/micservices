package polymorphism;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please enter object"); 
		String objName = sca.nextLine();
		
		Objectcreation oc = new Objectcreation();
		Guest b = oc.getobject(objName);
		b.comein();
		
	}
	}
  
 
 

