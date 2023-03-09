import java.util.*;
public class stack {
    public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void rev( Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        rev(s);
        pushAtBottom(top, s);

    }
    public static void main(String args[]) {


        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

       rev(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
