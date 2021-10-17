public class App {

    public static void main(String[] args) {
        System.out.println("CC5\n");
        LinkedList list=new LinkedList();
        list.insert(24);
        list.insert(364);
        list.insert(284);
        list.insert(200);
        System.out.println("===================================\n");
        System.out.println("Does the linked list include ("+364+") : "+list.includes(364));
        System.out.println("\n\nDoes the linked list include ("+150+") : "+list.includes(150));
        System.out.println("===================================\n");
        Node head= list.head;
        System.out.println("===================================\n");

        System.out.println("the linked list elements :");
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
        }
        System.out.println("===================================\n");
        System.out.println(list.toString());
        System.out.println("===================================\n");
        System.out.println("CC6\n");

        LinkedList list2=new LinkedList();
        System.out.println("===================================\n");
        System.out.println("append");
        list2.append(1);
        list2.append(3);
        list2.append(2);
        list2.append(5);
        list2.append(4);
        System.out.println(list2.toString());
        System.out.println("===================================\n");
        System.out.println("insert Before");
        list2.insertBefore(3,7);
        System.out.println(list2);
        System.out.println("===================================\n");
        System.out.println("insert After");
        System.out.println("===================================\n");

        list2.insertAfter(5,45);
        System.out.println(list2);
} }
