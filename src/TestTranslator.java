import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
    @Test
    public void TestInvalidCharacterInput() {
        String testdata = "Hello!";
        String expected = "Invalid character: !";
        try {
            MorseCodeTranslator.toMorse(testdata);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            String actual = e.getMessage();
            assertEquals(expected, actual);
        }
    }


    @Test
    public void TestMorseToNumbers() {
        String testdata = ".---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----";
        String expected = "1234567890";
        String actual = MorseCodeTranslator.fromMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void TestNumbersToMorse() {
        String testdata = "1234567890";
        String expected = ".---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----";
        String actual = MorseCodeTranslator.toMorse(testdata);
        assertEquals(expected, actual);
    }
}
