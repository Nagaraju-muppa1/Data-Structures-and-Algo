import java.util.*;
public class BinarySearch {
    public static String findElement(int key,int[] nums){
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        while(low<high){
           int mid = (low+high)/2;
           if(nums[mid]==key){
            return "Element is found :"+nums[mid];
           }else if(nums[mid]>key){
              high = mid-1;
           }else{
              low = mid+1;
           }
        }
        return "Element is Not Found.";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements into the array : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search :");
        int k=sc.nextInt();
        System.out.println(findElement(k,nums));
    }
}
