package LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode list1a = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2a = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = solution.mergeTwoLists(list1a, list2a);
        printList(mergedList1);

        // Example 2
        ListNode list1b = null;
        ListNode list2b = null;
        ListNode mergedList2 = solution.mergeTwoLists(list1b, list2b);
        printList(mergedList2);

        //Example 3
        ListNode list1c = null;
        ListNode list2c = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list1c, list2c);
        printList(mergedList3);
    }


    // Метод для вывода списка на экран
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
