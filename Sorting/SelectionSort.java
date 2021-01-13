import java.util.*;
public class SelectionSort {
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
		int sorted[]=SelectionSort(n,arr);
		System.out.println("\nAfter sorting :");
		for(int i:sorted) {
			System.out.print(i+" ");
		inp.close();
	}

}
	private static int[] SelectionSort(int n, int[] arr) {

		int temp;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
}