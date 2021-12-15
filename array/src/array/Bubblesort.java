package array;

public class Bubblesort {
public static void main(String[] args) {
	int a[]= {15,16,6,8,5};
	int temp=0;
	for(int i=0;i<a.length-1; i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			     }
		}
	}
		for(int i=0;i<a.length; i++) {
		System.out.println(a[i]);
		}
	}
	
}

//put flag in above program
	/*for(int i=0;i<a.length-1; i++) {
		 int flag=0;
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			     }
		}
	
	        if(flag==0) {
	        	break;
	        }
	}
		for(int i=0;i<a.length; i++) {
		System.out.println(a[i]);
		}
	}
	
}*/
	//String[] a= {"deepak","rajesh","kumar","amit","rahul"};
	//String temp;
	/*for (int i=0;i<a.length-1;i++) {
	  for(int j=0;j<a.length-1-i;j++) {
			if(a[j].compareTo(a[j+1])>0){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for (int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	}
	}*/
/////////////////////////////////////////////////////////////////////////////////	
	/*int min;
	for (int i=0;i<a.length;i++) {
		min=i;
		  for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0){
					min=j;
				}
			}
		  temp=a[i];
			a[i]=a[min];
			a[min]=temp;

		}
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		}
		}*/
//////////////////////////////////////////////////////////////////////

	
	
	