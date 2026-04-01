
public class AddFirstNode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class CircularLinkedList {
        Node head = null;
        void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // last node tk le aayega 
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
        void display() {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(10);
        //cll.addFirst(20);
        cll.addFirst(30);
        cll.display(); 
    }
}





public class Main {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Circular Linked List class
    static class CircularLinkedList {
        Node head = null;

        // add at beginning
        void addFirst(int data) {
            Node newNode = new Node(data);

            // empty list
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // last node
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }

        // add at end
        void addLast(int data) {
            Node newNode = new Node(data);

            // empty list
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next; // last node
            }

            temp.next = newNode;
            newNode.next = head;
        }

        // display list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    // main method
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(10);
        cll.addFirst(20);
        cll.addLast(30);
        cll.addLast(40);

        cll.display();   // Output: 20 10 30 40
    }
}
