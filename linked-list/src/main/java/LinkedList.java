import java.util.ArrayList;

public class LinkedList {
        Node head;


        public void insert(int value) {
                Node newNode = new Node(value);

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

        public void append(int value) {
                Node newNode = new Node(value);
                if (head == null) {
                        head = newNode;
                } else {
                        Node current = head;
                        while (current.next != null) {
                                current = current.next;
                        }
                        current.next = newNode;
                }
        }

        public void insertBefore(int value, int newValue) {
                Node newNode = new Node(newValue);

               if (head.value == value) {
                        Node theRightNode = head;
                        head = newNode;
                        newNode.next = theRightNode;
                } else {
                        Node current = head;
                        while (current.next != null) {
                                if (current.next.value == value) {
                                        Node theRightNode = current.next;
                                        current.next = newNode;
                                        newNode.next = theRightNode;

                                }
                                current = current.next;
                        }
                }
        }

        public void insertAfter(int value, int newValue) {
                Node newNode = new Node(newValue);

                        Node current = head;
                        while (current != null) {
                                if (current.value == value) {
                                        Node theRightNode = current.next;
                                        current.next = newNode;
                                        newNode.next = theRightNode;
                                }
                                current = current.next;
                        }

        }


}