public class solution2{

    public class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;

        }
       
    }
    node head;

    // function for  inserting node at given position
    void inserting(node prev_node , int value){
        node newNode = new node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    // function for display the code
    void display(){
        node current = head;
        while (current != null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        solution2 list = new solution2();
      list.head = list.new node(1);
        list.head.next = list.new node(2);
        list.head.next.next = list.new node(4);
        list.head.next.next.next = list.new node(5);
        list.head.next.next.next.next= list.new node(6);
        list.display();
   System.out.println();
        System.out.println(" new list");
        list.inserting(list.head.next, 3);
        list.display();

    }

}