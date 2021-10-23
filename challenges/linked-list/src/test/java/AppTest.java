
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class AppTest {
    //cc6
    @Test
    void testInsertMethod() {
        System.out.println("Test SUCCESS");
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(33);
        list.insert(333);
        list.insert(3333);
        String expected = "{3333}->{333}->{33}->{3}->NULL";
        String actual = list.toString();
        assertEquals(expected, actual);
    }
    @Test
    void testIncludesMethod() {
        System.out.println("Test SUCCESS");
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(55);
        list.insert(555);
        assertEquals(true, list.includes(55));
        assertEquals(false, list.includes(60));
    }

    @Test
    void testToStringMethod() {
        System.out.println("Test SUCCESS");
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(55);
        String expected = "{55}->{5}->NULL";
        assertEquals(expected, list.toString());
    }
    // cc7
    @Test
    void testAppendMethodHappyPath() {
        System.out.println("1th Test SUCCESS");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        String expected = "{5}->{10}->{15}->NULL";
        assertEquals(expected, list.toString());
    }
    @Test
    void testAppendMethodExpectedFailure() {
        System.out.println("2th Test Failed");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        String expected = "{5}->{10}->{15}->";
        assertEquals(expected, list.toString());
    }
    @Test
    void testAppendMethodEdgeCase() {
        System.out.println("3th Test Failed Edge Case");
        LinkedList list = new LinkedList();
        String expected = "   ";
        assertEquals(expected, list.toString());
    }

    @Test
    void testInsertBeforeHappyPath() {
        System.out.println("4th Test SUCCESS");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertBefore(10, 1000);
        String expected = "{5}->{1000}->{10}->{15}->NULL";
        assertEquals(expected, list.toString());
    }
    @Test
    void testInsertBeforeExpectedFailure() {
        System.out.println("5th Test Failed");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.insertBefore(10, 1000);
        String expected = "{5}->{1000}->{10}->{15}->NULL";
        assertEquals(expected, list.toString());
    }
    @Test
    void testInsertBeforeEdgeCase() {
        System.out.println("6th Test Failed EdgeCase");
        LinkedList list = new LinkedList();
        list.insertBefore(10, 1000);
        String expected = "   ";
        assertEquals(expected, list.toString());
    }
    @Test
    void testInsertAfterHappyPath() {
        System.out.println("7th Test SUCCESS");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.insertAfter(10, 1000);
        String expected = "{5}->{10}->{1000}->{15}->NULL";
        assertEquals(expected, list.toString());
    }
    @Test
    void testInsertAfterExpectedFailure() {
        System.out.println("8th Test Failure");
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.insertAfter(10, 1000);
        String expected = "{5}->{10}->{1000}->{15}->NULL";
        assertEquals(expected, list.toString());
    }
    @Test
    void testInsertAfterEdgeCase() {
        System.out.println("9th Test EdgeCase");
        LinkedList list = new LinkedList();
        list.insertAfter(10, 1000);
        String expected = "     ";
        assertEquals(expected, list.toString());
    }
// cc7 test

    @Test
    void testGetKthFromEndHappyPath() {
        System.out.println("10th Test SUCCESS");
        LinkedList list = new LinkedList();
        list.append(50);
        list.append(150);
        list.append(250);
        list.append(350);
        assertEquals("The value that located at index 2  from the tail in this linked list [50, 150, 250, 350] IS: 150", list.getKthFromEnd(2));
    }
    @Test
    void testGetKthFromEndExpectedFailure() {
        System.out.println("11th Test Failure");
        LinkedList list = new LinkedList();
        list.append(50);
        list.append(150);
        list.append(250);
        assertEquals("The value that located at index 2  from the tail in this linked list [50, 150, 250, 350] IS: 150", list.getKthFromEnd(2));
    }
    @Test
    void testGetKthFromEndEdgeCase() {
        System.out.println("12th Test Failure EdgeCase");
        LinkedList list = new LinkedList();
        assertEquals(" ", list.getKthFromEnd(2));
    }

    // cc8

    @Test
    void testZipListsHappyPath() {
        System.out.println("13th Test SUCCESS");
        LinkedList list1 = new LinkedList();
        list1.append(50);
        list1.append(150);
        list1.append(250);
        list1.append(350);
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        list2.append(3);
        LinkedList zippedList=new LinkedList();
        zippedList.head=zippedList.zipLists(list1,list2);
        assertEquals("{50}->{1}->{150}->{2}->{250}->{3}->{350}->NULL",zippedList.toString());
    }
    @Test
    void testZipListsExpectedFailure() {
        System.out.println("14th Test Failure");
        LinkedList list1 = new LinkedList();
        list1.append(50);
        list1.append(150);
        list1.append(250);
        list1.append(350);
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        LinkedList zippedList=new LinkedList();
        zippedList.head=zippedList.zipLists(list1,list2);
        assertEquals("{50}->{1}->{150}->{2}->{250}->{3}->{350}->NULL",zippedList.toString());
    }
    @Test
    void testZipListsEdgeCase() {
        System.out.println("15th Test Failure EdgeCase");
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList zippedList=new LinkedList();
        zippedList.head=zippedList.zipLists(list1,list2);
        assertEquals("     ",zippedList.toString());
    }

}