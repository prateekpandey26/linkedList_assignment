public class solution4 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = newNode; 
        }
    }

    // Method to check if the linked list is a palindrome
    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty list or single node is a palindrome
        }

        // Step 1: Find the midpoint of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1
            fast = fast.next.next; // Move fast pointer by 2
        }

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev; // Reverse the current node's pointer
            prev = current;
            current = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev; // This is the head of the reversed second half

        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; 
    }

    // Method to display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solution4 list = new solution4();
        solution4 list2 = new solution4();

        // Creating the linked list: 1 -> 2 -> 2 -> 1
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);

        System.out.print("Linked List: ");
        list.display();

        // Check if the linked list is a palindrome
        boolean result = list.isPalindrome();
        System.out.println("Is the linked list a palindrome? " + result);

        System.out.println();
        System.out.println("Example 2");
        list2.insert(1);
        list2.insert(2);
        System.out.print("Linked List: ");
        list2.display();
        boolean result2 = list2.isPalindrome();
        System.out.println("Is the linked list a palindrome? " + result2); // Expected output: false
    }
}

