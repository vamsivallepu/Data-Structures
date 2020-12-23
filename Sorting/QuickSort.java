public class QuickSort {
    public static void main(final String[] args) {
        int arr[]={9,6,8,5,7,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void quicksort(int[] arr,int l, int e){
        if(l<e){
            int p=partition(arr,l,e);
            quicksort(arr, l, p-1);
            quicksort(arr, p+1, e);
        }
    }
    private static int partition(int[] arr,int l, int e){
        int temp;
        int pi=l;
        while(l!=e){
            while((arr[pi]<=arr[e]) && (pi!=e)){
                e--;
            } 
            if(arr[pi]>arr[e]){
                temp=arr[pi];
                arr[pi]=arr[e];
                arr[e]=temp;
                pi=e;
            }
            while((arr[pi]>=arr[l]) && (pi != l)){
                l++;
            }
            if(arr[pi]<arr[l]){
                temp=arr[pi];
                arr[pi]=arr[l];
                arr[l]=temp;
                pi=l;
            }
        }
        return pi;
    }
}
