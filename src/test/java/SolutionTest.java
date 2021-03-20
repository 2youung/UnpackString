import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testStringUnpack1() {
        String result = solution.stringUnpack(new StringBuilder("3[xyz]4[xy]z"));
        Assertions.assertEquals(result, "xyzxyzxyzxyxyxyxyz");
    }

    @Test
    public void testStringUnpack2() {
        String result = solution.stringUnpack(new StringBuilder("2[3[x]y]"));
        Assertions.assertEquals(result, "xxxyxxxy");
    }

    @Test
    public void testStringUnpack3() {
        String result = solution.stringUnpack(new StringBuilder("2[xyz]2[xy]"));
        Assertions.assertEquals(result, "xyzxyzxyxy");
    }

}