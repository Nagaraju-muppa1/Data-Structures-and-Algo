import java.util.*;
public class SelectionSort {
    public static void Selection(int[] nums){
        for(int i=0;i<nums.length;i++){
            int min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int temp = nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println("Elements after sorting :");
        for(int a:nums){
            System.out.print(a+" ");
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
        Selection(nums);
    }
}
