import java.util.*;
public class Bubble{
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting !");
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);     
    }
}