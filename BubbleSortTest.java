import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void testSort1() {
        List<Integer> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        List<Integer> actual = BubbleSort.sort(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort2() {
        List<Double> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Double> expected = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        List<Double> actual = BubbleSort.sort(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort3() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = BubbleSort.sort(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort4() {
        List<Double> input = Arrays.asList(null, 5.0001);
        List<Double> expected = Arrays.asList(5.0001);
        List<Double> actual = BubbleSort.sort(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testSort5() {
        List<Integer> input = null;
        BubbleSort.sort(input);
    }
}