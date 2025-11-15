import java.util.*;
public class StackArr{
    public static int push(int top,int[] stack,int element){
        if(top == stack.length-1){
            System.out.println("Stack is Full!");
            return top;
        }
        top++;
        //System.out.println(top);
        stack[top]=element;
        System.out.println("Successfully Pushed element:"+element);
        return top;
    }
    public static int pop(int top,int[] stack){
        if(top == -1){
            System.out.println("Stack is Empty !");
            return top;
        }
        System.out.println("Successfully poped the element:"+stack[top]);
        top--;
        return top;
    }
    public static void peek(int top,int[] stack){
        if(top == -1){
            System.out.println("Stack is Empty !");
            return ;
        }
        System.out.println("The Peek element is :"+stack[top]);
    }
    public static void display(int top,int[] stack){
        if(top == -1){
            System.out.println("Stack is Empty !");
            return ;
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Stack:");
        int n=sc.nextInt();
        int stack[] = new int[n];
        int top=-1;
        while(true){
            System.out.println("1.Push\n"+"2.Pop\n"+"3.Peek\n"+"4.Display\n"+"5.Exit\n"+"choose one of the option: ");
            int option=sc.nextInt();
            if(option==1){
               System.out.println("Enter the element to push:");
               int element=sc.nextInt();
               top = push(top,stack,element);
            }else if(option==2){
               top = pop(top,stack);
            }else if(option == 3){
                peek(top,stack);
            }
            else if(option == 4){
                display(top,stack);
            }else{
                break;
            }
        }
    }
}