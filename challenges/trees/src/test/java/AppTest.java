/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

        @Test public
        void fizzBuzzTests() {
            KTree ktree = new KTree();
            NodeK root0 = new NodeK("24");
            NodeK node10 = new NodeK("15");
            NodeK node20 = new NodeK("20");
            NodeK node30 = new NodeK("65");
            NodeK node40 = new NodeK("30");
            NodeK node50 = new NodeK("555");
            NodeK node60 = new NodeK("18");

            ktree.root = root0;
            root0.children.add(node10);
            root0.children.add(node20);
            node10.children.add(node30);
            node20.children.add(node40);
            node20.children.add(node50);
            node20.children.add(node60);

            assertEquals("Fizz FizzBuzz Buzz Buzz FizzBuzz FizzBuzz Fizz ",ktree.fizzBuzz(root0));

        }

    }

