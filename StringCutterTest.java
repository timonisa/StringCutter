
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCutterTest {

    @Test
    public void yourTest() {
        String yourTest = "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York only";
        String actual = StringCutter.stringCutter(yourTest);
        String expected = "Volvo released a new ...";
        assertEquals(expected, actual);
    }

    @Test
    public void twoWords() {
        String twoWords = "Not enough";
        String actual = StringCutter.stringCutter(twoWords);
        String expected = "Not enough";
        assertEquals(expected, actual);
    }

    @Test
    public void emptyString() {
        String empty = "";
        String actual = StringCutter.stringCutter(empty);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void oneWord25simb() {
        String sim25 = "Stringlongatthat25simbols";
        String actual = StringCutter.stringCutter(sim25);
        String expected = "Stringlongatthat25simbols";
        assertEquals(expected, actual);
    }

    @Test
    public void someWord25simb() {
        String sim25wspc = "Stringlong that25 simbols";
        String actual = StringCutter.stringCutter(sim25wspc);
        String expected = "Stringlong that25 simbols";
        assertEquals(expected, actual);
    }

    @Test
    public void someWord26simb() {
        String sim26 = "Stringlongathat 26 simbols";
        String actual = StringCutter.stringCutter(sim26);
        String expected = "Stringlongathat 26 ...";
        assertEquals(expected, actual);
    }

    @Test
    public void longLongStr() {
        String longLongStr = "Superlonglongstringwithoutspaces";
        String actual = StringCutter.stringCutter(longLongStr);
        String expected = "Superlonglongstringwit...";
        assertEquals(expected, actual);
    }
}