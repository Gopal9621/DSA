//  import java.util.*;
// public class StackOperations {
//     public static void main(String[] args){

//     }
// }


class StackOperations{
    int max = 5;
    int top = -1;
    int[] Stack = new int[max];
    
    void push(int ele){
        if(top == max -1){
            System.out.println("Stack is OverFlow");
        }
        else{
            top++;
            Stack[top] = ele;
            System.out.println(ele +" Pushed");
        }
    } 
        void pop(){
            if(top == -1){
                System.out.println("Stack is UnderFlow");
            }
            else{
               // Stack[top] = ele;
                System.out.println(Stack[top] + " Popped");
                top--;
            }
        }
        
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top Element is "+ Stack[top]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i = top; i>=0; i--){
                System.out.print(Stack[i]+ " ");
            }
                System.out.println();
        }
    }
    public static void main(String[] args){
        StackOperations S1 = new StackOperations();
        
        S1.push(10);
        S1.push(20);
        S1.push(30);
        S1.push(40);
        S1.push(50);
        S1.display();
        S1.peek();
        S1.pop();
        S1.pop();
        S1.display();
        S1.peek();
        
    }
}