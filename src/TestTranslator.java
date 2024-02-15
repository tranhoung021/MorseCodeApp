import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTranslator {
    @Test
    public void TestAlphabetToMorse() {
        String testdata = "HELLO";
        String expected = ".... . .-.. .-.. ---";
        String actual = MorseCodeTranslator.toMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void TestAlphabetToMorseWithSpaces() {
        String testdata = "HELLO WORLD";
        String expected = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
        String actual = MorseCodeTranslator.toMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void TestAlphabetToMorseWithLowerCase() {
        String testdata = "hello";
        String expected = ".... . .-.. .-.. ---";
        String actual = MorseCodeTranslator.toMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseToAlphabet() {
        String testdata = ".-- --- .-. .-.. -..";
        String expected = "WORLD";
        String actual = MorseCodeTranslator.fromMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseToAlphabetWithSpaces() {
        String testdata = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
        String expected = "HELLO WORLD";
        String actual = MorseCodeTranslator.fromMorse(testdata);
        assertEquals(expected, actual);
    }
}
