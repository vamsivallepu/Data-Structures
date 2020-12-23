import java.util.Scanner;
public class BubbleSort {
	
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
		int sorted[]=bubbleSort(n,arr);
		System.out.println("\nAfter sorting :");
		for(int i:sorted) {
			System.out.print(i+" ");
		}
		inp.close();
	}

	private static int[] bubbleSort(int n, int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
