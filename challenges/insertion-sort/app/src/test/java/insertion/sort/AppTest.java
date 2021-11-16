/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static insertion.sort.App.insertionSort;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        int[] array = {8,4,23,42,16,15};
        int[] arrayOne = {};
        int[] arrayTwo = {};
        int []arrayThree={4,8,15,16,23,42};

        assertEquals(Arrays.toString(arrayThree),Arrays.toString(insertionSort(array)));

        assertEquals(Arrays.toString(arrayOne),Arrays.toString(insertionSort(arrayTwo)));

    }
    @Test void mergeSortTest(){
        int[] array={15,19,3,17,8,2};
        int[] Result={2,3,8,15,17,19};
        assertArrayEquals(Result,App.mergeSort(array));


    }
    @Test void quickSort(){
        int[] array={15,19,3,17,8,2};
        int[] Result={2,3,8,15,17,19};
        assertArrayEquals(Result,App.mergeSort(array));


    }
}
