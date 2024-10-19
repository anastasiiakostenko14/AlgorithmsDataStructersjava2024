package LinkedList;

public class ListNode {
    public final int val;
    public ListNode next;

    // Конструктори
    public ListNode(final int val) {
        this.val = val;
    }

    public ListNode(final int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Переопределение toString для вывода списка
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            result.append(current.val).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
