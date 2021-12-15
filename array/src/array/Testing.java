package array;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Testing {
public static void main(String[] args) {
/*	int[][] a= {{10,20},{30,40,50}};
	for (int i=0;i<a.length; i++)
	{ 
	for (int j=0;j<a[i].length;j++) {
		System.out.print(a[i][j]);
		}
	System.out.println();
	}
}

}*/
/*int[][][] a={{10,20},{30,40,50}},{{60,70,80},{90,20}};
for (int i=0;i<a.length; i++)
{ 
for (int j=0;j<a[i].length;j++)
{
for(int k=0;k<a[i][j].length;k++){
System.out.println(a[i][j][k]);
}
System.out.println();
}
System.out.println();
}
}
}*/
	//second largest element in an array
	 /*int[] a= {6,8,2,4,3,1};
	int temp;
	for (int i=0;i<a.length; i++)
	{ 
	for (int j=i+1;j<a.length;j++)
	{
	if(a[i]<a[j]) {               //if 2nd smalest if(a[i]>a[j]){//
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}
	
     if(i==1) {     	          //for (int i=0;i<a.length; i++)//
	     break ; 
     }  
	}                            // { System.out.print(a[i]);//
     for (int i=0;i<a.length; i++)  
     { System.out.print(a[i]);
        }
     }
}*/
/*	int[] a= {4,3,5,2,1};
	int min =a[0];
		for(int i=0; i<a.length;i++) {
		if(a[i]<min) 
		{
		  min=a[i];
		  System.out.println(a[i]);
		}
		}
System.out.println("oue min value"+" " +min);
}
}*/
  
	/*    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.set(0, "Opel");
	    cars.remove(0);
	    cars.size();
	    System.out.println(cars);
	  }
	} */
	/*try {
       FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\file read.txt");
       int i=fr.read();
       char ch=(char)i;
       while(i!=- 1) {
       System.out.print((char)i);
      i=fr.read();
       }

    }
catch(Exception e) {
	System.out.println("error");
         }
}
}*/ 
	
	/*try {
	
	          FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\file read.txt");    
	          int i;    
	          while((i=fr.read())!=-1) {   
	          System.out.print((char)i);    
	            
	           } 
	          
	          fr.close(); 
	}
	
catch(Exception e) {
	System.out.println("error");
}

	}  
}*/
	/*String s= "hello";
	char ch[]=s.toCharArray();
	for (int i=ch.length-1;i>=0;i--) {
		System.out.println("char"+i+"index is"+ ch[i]);*/

String[] a= {"deepak","rajesh","kumar","amit","rahul","vinod"};
String temp;
for (int i=0;i<a.length;i=i++) {
	for(int j=0;j<a.length-1-i;j++) {
		if(a[j].compareTo(a[j+1])>0){
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for (int i=0;i<a.length;i=i++){
	System.out.println(a[i]+" ");
}
}
}

	
	
	
	
	
	
	
	
	