public class App {

    public static void main(String[] args) {
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

    }
}
