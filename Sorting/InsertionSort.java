import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter number of Elements to be entered in an arry :");
		int n=inp.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
		}
		System.out.println("before sorting :");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int sorted[]=insertionSort(n,arr);
		System.out.println("\nAfter sorting :");
		for(int i:sorted) {
			System.out.print(i+" ");
	}
	inp.close();

}

	private static int[] insertionSort(int n, int[] arr) {
		// TODO Auto-generated method stub
		int key,temp;
		for(int i=1;i<n;i++) {
			int j=i-1;
			key=arr[i];
			while(j>=0 && key<arr[j]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		return arr;
	}
}
