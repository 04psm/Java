package array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {3,1,-2,7,4,0};
		int n = a.length;
		for(int i = 0 ; i<n-1;i++) {
			 int min = i ; 
			 for(int j = i ; j<n; j++) {
				if(a[j]<a[min]) {
					min=j ;
				}
			 }
			 int temp = a [i];
			 a[i] = a[min];
			 a[min] = temp; 
			 
		}
		for(int e:a) {
			System.out.print (e + " ");
		}
	}

}
