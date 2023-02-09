package musie.testing.lab13testing.q7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

//import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//@RunWith(JUnit4.class)
class ArrayReversorTest {
private ArrayReversor arrayReversor;
    @BeforeEach
    void setUp() {
        arrayReversor=new ArrayReversor();
    }

    @AfterEach
    void tearDown() {
        arrayReversor=null;
    }

    @Test
    public void whenInputIsLegit2DArray_thenReturnReversedFlattenedArray() {
        ArrayReversor arrayReversor = new ArrayReversor();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {9, 5, 4, 0, 3, 1};
        int[] result = arrayReversor.reverseArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenInputIsNull_thenReturnNull() {
        ArrayReversor arrayReversor = new ArrayReversor();
        int[][] input = null;
        int[] result = arrayReversor.reverseArray(input);
        assertNull(result);
    }
}