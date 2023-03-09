import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ql {
    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     for (int i = 1; i < 5; i++) {
    //         q.add(i);
    //     }

    //     System.out.println("Elements are:"+q);
    // }
    static int[] arr = new int[10];
    static int n= 10;
    static int front = -1;
    static int rear = -1;


    static void enqueue(int item){
        if (rear== n -1){
            System.out.println("overflow");
            return;
        }
        else{
            if(front == -1 && rear== -1){
                    front= 0;
                    rear=0;
            }
            else{
                rear++;
            }
       
        arr[rear]= item;
        System.out.println("inserted");
    } 
}
    
static void dequeue(){
    if (front == -1 || front>rear){
        System.out.println("underflow");
        return;
    }
    else{
        int item = arr[front];
        System.out.println(
            "element deleted is "+ item
        );   
        if (front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
}

static void dis(){
    if (front == -1){
        System.out.println("queue is empty");
        return;
    }
    else{
        System.out.println(
            "elements are:"
        );
        for(int i= front;i<=rear;i++){
            System.out.println(
                arr[i]+" "
                );
                //System.out.println();
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i<=arr.length;i++){
        int item= sc.nextInt();
        enqueue(item);
        };
        dis();
    }
}
