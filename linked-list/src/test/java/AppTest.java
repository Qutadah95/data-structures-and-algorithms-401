
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class AppTest {

@Test void testForLinkedList(){
    System.out.println("First test ");
    LinkedList list = new LinkedList();
    list.insert(3);
    list.insert(33);
    list.insert(333);
    list.insert(3333);

    assertTrue(list.includes(3)==true);
}

}