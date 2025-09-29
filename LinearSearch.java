import java.util.*;
public class LinearSearch{
    public static String findElement(int key,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return "Element is found at :"+i;
            }
        }
        return "Element is not found";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements :");
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to be search :");
        int x = sc.nextInt();
        System.out.println(findElement(x,nums));
        
    }
}