import java.util.*;
public class FindingPeekInStack {
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<> ();
        
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        int  max = s1.peek();
        System.out.println(max);

    }
}
