/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test void testPushToStackOneNode() {
        System.out.println("test 1 passed");
        Stack <Integer>stack=new Stack<>();
        stack.push(15);
        assertEquals("top -> 15 -> null", stack.toString());
    }
    @Test void testPushToStackMultiNode() {
        System.out.println("test 2 passed");
        Stack <Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(25);
        stack.push(37);
        assertEquals("top -> 37 -> 25 -> 10 -> null", stack.toString());
    }
    @Test void testPopOfTheStack() {
        System.out.println("test 3 passed");
        Stack <Integer>stack=new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.pop();

        assertEquals("top -> 22 -> 11 -> null", stack.toString());
    }
    @Test void testPopUntilEmptyStack() {
        System.out.println("test 4 passed");
        Stack <Integer>stack=new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals("NULL", stack.toString());
    }
    @Test void testPeekNextItem() {
        System.out.println("test 5 passed");
        Stack <Integer>stack=new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.pop();
        assertEquals(java.util.Optional.of(33), stack.peek());
    }
    @Test void testInstantiateEmptyStack() {
        System.out.println("test 6 passed");
        Stack <Integer>stack=new Stack<>();

        assertEquals("NULL", stack.toString());
    }
    @Test void testExeptionPeekOrPopEmptyStack() {
        System.out.println("test 7 passed");
        Stack <Integer>stack=new Stack<>();
        stack.peek();
        stack.pop();

        assertEquals("NULL", stack.toString());
    }
    @Test void testEnqueueOneNodeToQueue() {
        System.out.println("test 8 passed");
        Queue <Integer>queue=new Queue<>();
        queue.enqueue(11);
        assertEquals("front -> 11 <- rear", queue.toString());
    }
    @Test void testEnqueueMultiNodeToQueue() {
        System.out.println("test 9 passed");
        Queue <Integer>queue=new Queue<>();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        assertEquals("front -> 11 -> 22 -> 33 <- rear", queue.toString());
    }
    @Test void testDequeueFromQueue() {
        System.out.println("test 10 passed");
        Queue <Integer>queue=new Queue<>();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        assertEquals(java.util.Optional.of(11), queue.dequeue());
    }
    @Test void testPeekQueue() {
        System.out.println("test 11 passed");
        Queue <String>queue=new Queue<>();
        queue.enqueue("Dom");
        queue.enqueue("Jeff");
        queue.enqueue("Jeniffer");
        assertEquals("Dom", queue.peek());
    }

    @Test void testDequeueToEmptyQueue() {
        System.out.println("test 12 passed");
        Queue <Boolean>queue=new Queue<>();
        queue.enqueue(true);
        queue.enqueue(false);
        queue.enqueue(true);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals("NULL", queue.toString());
    }
    @Test void testInstantiateEmptyQueue () {
        System.out.println("test 13 passed");
        Queue <Boolean>queue=new Queue<>();

        assertEquals("NULL", queue.toString());
    }
    @Test void testExeptionPeekOrDequeueEmptyQueue() {
        System.out.println("test 14 passed");
        Queue <Integer>queue=new Queue<>();
        queue.peek();
        queue.dequeue();
        assertEquals("NULL", queue.toString());
    }

    @Test void testEnqueue(){

        System.out.println("test 15 SUCCESS");
        pseudoQueue<Integer> test = new pseudoQueue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.dequeue();

        assertEquals("PseudoQueue{stack1=[], stack2=[4, 3, 2]}", test.toString());
    }

    @Test
    void testPseudoQueue() {
        pseudoQueue<Integer> pseudoQueue = new pseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();

        assertEquals("PseudoQueue{stack1=[], stack2=[4, 3, 2]}", pseudoQueue.toString());
    }

    @Test
    void testPseudoQueueWithEmptyQueue() {
        pseudoQueue<Integer> pseudoQueue = new pseudoQueue();
//        pseudoQueue.enqueue(1);
//        pseudoQueue.enqueue(2);
//        pseudoQueue.enqueue(3);
//        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();

        assertEquals("PseudoQueue{stack1=[], stack2=[]}", pseudoQueue.toString());
    }

    @Test
    void testPseudoDequeueTheDequeue() {
        pseudoQueue<Integer> pseudoQueue = new pseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);

        assertEquals(java.util.Optional.of(1), pseudoQueue.dequeue());
    }

    @Test
    void testAnimalShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        cats cat1 = new cats("catty", "cat");
        cats cat2 = new cats("mishmish", "cat");
        dogs bull = new dogs("bull", "dog");
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(bull);
        animalShelter.enqueue(bull);
        animalShelter.dequeue("cat");
        animalShelter.dequeue("dog");

        assertEquals("AnimalShelter{dogs=front -> Dog : bull - type : dog <- rear, cats=front -> Cat : mishmish -  type :" +
                " dog <- rear}", animalShelter.toString());
    }

    @Test
    void testEnqueueToAnimalShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        cats cat1 = new cats("catty", "cat");
        dogs bull = new dogs("bull", "dog");
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(bull);

        assertEquals("AnimalShelter{dogs=front -> Dog : bull - type : dog <- rear, cats=front -> Cat : catty -  type : cat " +
                "<- rear}", animalShelter.toString());
    }

    @Test
    void testDequeueFromAnimalShelter() {
        AnimalShelter animalShelter = new AnimalShelter();
        cats catty = new cats("catty", "cat");
        dogs bull = new dogs("bull", "dog");
        animalShelter.enqueue(catty);
        animalShelter.enqueue(bull);
        animalShelter.dequeue("dog");


        assertEquals("AnimalShelter{dogs=NULL, cats=front -> Cat : catty -  type : cat <- rear}",
                animalShelter.toString());
    }
}
