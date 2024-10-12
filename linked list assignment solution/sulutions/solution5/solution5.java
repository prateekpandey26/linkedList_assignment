class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class solution5 {

    // Helper function to reverse the linked list (because we need to start addition from the least significant digit)
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    // Function to add two numbers represented by linked lists
    public static ListNode addTwoLists(ListNode l1, ListNode l2) {
        // Reverse both lists to start addition from the least significant digit
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummyHead = new ListNode(0);  // Dummy head for the result list
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        // Reverse the result list to get the final answer
        return reverse(dummyHead.next);
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1: List1: 5->6->3, List2: 8->4->2 (563 + 842 = 1405)
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(2);

        ListNode result = addTwoLists(l1, l2);
        System.out.print("Resultant list: ");
        printList(result);  // Output: 1->4->0->5 (1405)

        // Example 2: List1: 7->5->9->4->6, List2: 8->4 (75946 + 84 = 76030)
        ListNode l3 = new ListNode(7);
        l3.next = new ListNode(5);
        l3.next.next = new ListNode(9);
        l3.next.next.next = new ListNode(4);
        l3.next.next.next.next = new ListNode(6);

        ListNode l4 = new ListNode(8);
        l4.next = new ListNode(4);

        ListNode result2 = addTwoLists(l3, l4);
        System.out.print("Resultant list: ");
        printList(result2);  // Output: 7->6->0->3->0 (76030)
    }
}