package LinkedList;

public class ListNode {
    // Поле val оголошено як final, оскільки його не можна змінити після ініціалізації
    public int val;
    public ListNode next;

    // Конструктори
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
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
