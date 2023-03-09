import java.util.LinkedList;

public class link {

    class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }

    }

    node head = null;
    node tail = null;

    public void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void display() {
        node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String args[]) {
        link list = new link();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.display();

    }

}
