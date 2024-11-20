package LinkedList;

public class Main {
    public static void main(String[] args) {
        //Добавлено final, где это было возможно.
        //переменные, не изменяющиеся после инициализации, были объявлены в качестве final
        //это касается объектов Solution, списков list1a, list2a и результатов mergedList1, mergedList2 и т.д
        final Solution solution = new Solution();

        // Example 1
        final ListNode list1a = new ListNode(1, new ListNode(2, new ListNode(4)));
        final ListNode list2a = new ListNode(1, new ListNode(3, new ListNode(4)));
        final ListNode mergedList1 = solution.mergeTwoLists(list1a, list2a);
        System.out.println(mergedList1);

        // Example 2
        final ListNode list1b = null;
        final ListNode list2b = null;
        final ListNode mergedList2 = solution.mergeTwoLists(list1b, list2b);
        System.out.println(mergedList2);

        // Example 3
        final ListNode list1c = null;
        final ListNode list2c = new ListNode(0);
        final ListNode mergedList3 = solution.mergeTwoLists(list1c, list2c);
        System.out.println(mergedList3);
    }
}

