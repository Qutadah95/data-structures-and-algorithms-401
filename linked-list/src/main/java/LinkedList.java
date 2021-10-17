import java.util.ArrayList;

public class LinkedList {
        Node head;
        public void insert(int value) {
                Node newNode = new Node( value);
                        newNode.next = head;
                        head = newNode;

        }

        public boolean includes(int value) {
                Node current = head;
                while (current.next != null) {
                        if (current.value == value) {
                                return true;
                        }
                        current = current.next;
                }
                return false;
        }

        public String toString() {
                String newString = "";
                Node current = head;
                while (current != null) {
                        newString += "{" + current.value + "}->";
                        current = current.next;
                }
                newString += "NULL";
                return newString;
        }
}
