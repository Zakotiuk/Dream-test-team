import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstHWTest {
    Set<String> setString1 = new HashSet<>();
    Set<String> setString2 = new HashSet<>();

    Set<Integer> setInt1 = new HashSet<>();
    Set<Integer> setInt2 = new HashSet<>();

    public FirstHWTest(){
        setString1.add("Math");
        setString1.add("Biology");
        setString1.add("Chemistry");
        // Fill setString2
        setString2.add("Ukr. lang.");
        setString2.add("Chemistry");
        setString2.add("PE");
        // Fill setInt1
        setInt1.add(1);
        setInt1.add(2);
        setInt1.add(3);
        // Fill setInt2
        setInt1.add(4);
        setInt1.add(2);
        setInt1.add(2);
    }

    @Test
    void testUnionSameValues(){
        Set<String> expected = new HashSet<>();
        expected.add("Math");
        expected.add("Biology");
        expected.add("Chemistry");
        expected.add("Math");
        expected.add("Biology");
        expected.add("Chemistry");

        Set<String> actual = FirstHW.union(setString1, setString1);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void testUnionStringType(){
        Set<String> expected = new HashSet<>();
        expected.add("Math");
        expected.add("Biology");
        expected.add("Chemistry");
        expected.add("PE");
        expected.add("Ukr. lang.");

        Set<String> actual = FirstHW.union(setString1, setString2);
        Assert.assertEquals(actual, expected);
    }
    
    @Test
    void testUnionIntegerType() {
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        Set<Integer> actual = FirstHW.union(setInt1, setInt2);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void testOneEmptyUnion() {
        Set<String> expected = new HashSet<>();
        expected.add("Math");
        expected.add("Biology");
        expected.add("Chemistry");

        setString2.clear();
        Set<String> actual = FirstHW.union(setString1, setString2);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void testTwoEmptyUnion() {
        Set<String> expected = new HashSet<>();
        setString1.clear();
        setString2.clear();
        Set<String> actual = FirstHW.union(setString1, setString2);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void testOneNullUnion() {
        Set<String> expected = new HashSet<>();
        Set<String> actual = FirstHW.union(setString1, null);
        Assert.assertEquals(actual, expected);
    }
    @Test
    void testBothNullUnion() {
        Set<String> expected = new HashSet<>();
        Set<String> actual = FirstHW.union(null, null);
        Assert.assertEquals(actual, expected);
    }
}
