import java.util.Scanner;
import java.util.*;
public class MergeSort {
    public static void merge(int low,int mid,int high,int[] nums){
        int left = low;
        int right = mid+1;
        List<Integer> ans = new ArrayList<>();
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                ans.add(nums[left]);
                left++;
            }else{
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            ans.add(nums[left]);
            left++;
        }
        while(right<=high){
            ans.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=ans.get(i-low);
        }
    }
    public static void Mergesort(int low,int high,int[] nums){
        if(low>=high) {
            return;
        }
         int mid =(low+high)/2;
         Mergesort(low,mid,nums);
         Mergesort(mid+1,high,nums);
         merge(low,mid,high,nums);
        
      
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
        Mergesort(0,nums.length-1,nums);
        System.out.println("Array after sorted:");
        for(int a:nums){
            System.out.print(a+" ");
        }
    }   
}
