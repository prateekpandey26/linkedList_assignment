
public class solution3{
    public class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
       
    
    }
    Node head;
    // function for adding data in the last
    void insert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
            
        }
        Node temp = head;
        while (temp.next != null) {
        temp = temp.next;
        }
        temp.next = newNode;
    }
    // function for deleting the dublicate
    void delete(){
        Node temp = head;
        while(temp != null && temp.next != null){
               if (temp.data ==  temp.next.data) {
                temp.next = temp.next.next;

                
               }
               temp = temp.next;
        }
    }
    void display(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }


    }
    public static void main(String[] args) {
        solution3 list = new solution3();
        System.out.println("original sorted list");
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.display();
        System.out.println();
        System.out.println("new list");
       list.delete();
       list.display();
System.out.println();
       solution3 list2 = new solution3();
       //[1,1,2,3,3]
       System.out.println("list 2");
       list2.insert(1);
       list2.insert(1);
       list2.insert(2);
       list2.insert(3);
       list2.insert(3);
       list2.display();
       System.out.println();
       System.out.println("new list 2");
       list2.delete();
       list2.display();
    }
}