import java.util.*;
public class DisplayEleInStack {
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<> ();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

         for(int i : s1){ 
             System.out.print(i+" ");
         }
         System.out.println();

        s1.pop();
        s1.pop();
        s1.peek();

         for(int i : s1){ 
         System.out.print(i+" ");
         }
             System.out.println();
    }
}
