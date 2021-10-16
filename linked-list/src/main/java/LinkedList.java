public class LinkedList <T>{
        Node newNode = new Node (value);
        newNode.next=head;
        head = newNode ;
        };

        boolean includes (T value){
        Node current =head ;
        while(current.next != null){
        if(current.value.equals(value)){
        return true;

        }
        current = current.next ;

        }
        return false ;
        }
@override
Public String toString (){
        Node current = head ;
        while(current !=null){
        result+="{"+current.value+"}->";
        current = current.next;
        }
        result +="Null";
        return result;
        }