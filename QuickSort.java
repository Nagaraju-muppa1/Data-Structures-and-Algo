import java.util.*;
public class QuickSort {

    public static int partition(int low,int high,int[] arr){
        int pivot = arr[low];
        while(low<high){
            while(pivot > arr[low]){
                  low++;
            }
            while(pivot < arr[high]){
                high--;
            }
            int temp =arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }
        arr[low]=pivot;
        return low;
    }

    public static void Quicksort(int low,int high,int[] arr){
       if(low < high){
           int pi = partition(low,high,arr);
           Quicksort(low,pi-1,arr);
           Quicksort(pi+1,high,arr);
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Quicksort(0,nums.length-1,nums);
        System.out.println("Array after sorted:");
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
}
