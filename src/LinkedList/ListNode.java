package LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    // Конструкторы
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Переопределила метод toString() c суперкласса Object для выведения списка
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            result.append(current.val).append(" ");
            current = current.next;
        }
        return result.toString().trim();  // удалим в конце лишние пробелы
    }
}
