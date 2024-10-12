
public class solution1{
public class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
   

}
Node head;
// method for inserting data in the end of the linked list1

void insert(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    return;
}
     String findK( int k){
        Node current = head;
        if (head == null) {
        return "empty list1";
            
        }
        while (current  != null) {
            if (current.data == k) {
                return  " yes k is found";
            }
            current = current.next;


    }
    return  "  k is not found";
}

// function for displaying list1

void display(){
    Node variable = head;
    while (variable != null) {
        System.out.print(variable.data + " ");
        variable = variable.next;
        
    }
    System.out.println();
}
public static void main(String[] args) {
    solution1 list1 = new solution1();
    System.out.println("example one");
    list1.insert(14);
    list1.insert(21);
     list1.insert(11);
    list1.insert(30);
    list1.insert(10);
    list1.display();

    
    String result = list1.findK(14);
    System.out.println(result);

    System.out.println();
    solution1 list2 = new solution1();
   System.out.println("example 2");
    list2.insert(6);
    list2.insert(21);
     list2.insert(17);
    list2.insert(30);
    list2.insert(10);
    list2.insert(8);
    list2.display();
   
    
    String result2 = list2.findK(13);
    System.out.println(result2);
}
}