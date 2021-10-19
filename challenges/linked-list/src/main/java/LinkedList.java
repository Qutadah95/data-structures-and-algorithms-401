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
        public String getKthFromEnd(int k) {
                int counter = 0;
                ArrayList<Integer> values = new ArrayList<>();
                        Node current = head;
                        while (current != null) {
                                values.add(current.value);
                                current = current.next;
                                counter++;
                        }
                        if (k < 0 || k > counter) {
                                return "Exception";
                        }
                        String reuternedValue= "Linked list = "+ values + "\n\nindex = ( "+k+" )" +
                                " \n\n"+"value = ( "+values.get((counter - 1) - k)+" ) ";
                        return reuternedValue ;
        }
        public Node zipLists(LinkedList list1, LinkedList list2) {
                if (list1.head == null) {
                        return list2.head;
                } else if (list2.head == null) {
                        return list1.head;
                } else {
                        Node current1=list1.head;
                        Node current2=list2.head;
                        Node list1Next,list2Next;
                        while (current1 != null && current2 != null) {
                                list1Next=current1.next;
                                list2Next=current2.next;
                                current2.next=list1Next;
                                current1.next=current2;
                                current1=list1Next;
                                current2=list2Next;
                        }
                        return list1.head;
                }
        }
}