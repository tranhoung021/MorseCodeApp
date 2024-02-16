import java.util.HashMap;
import java.util.Map;

public class MorseCodeHashmaps {
    public static final Map<Character, String> TO_MORSE = new HashMap<>();
    public static final Map<String, Character> FROM_MORSE = new HashMap<>();

    static {
        TO_MORSE.put('A', ".-");
        TO_MORSE.put('B', "-...");
        TO_MORSE.put('C', "-.-.");
        TO_MORSE.put('D', "-..");
        TO_MORSE.put('E', ".");
        TO_MORSE.put('F', "..-.");
        TO_MORSE.put('G', "--.");
        TO_MORSE.put('H', "....");
        TO_MORSE.put('I', "..");
        TO_MORSE.put('J', ".---");
        TO_MORSE.put('K', "-.-");
        TO_MORSE.put('L', ".-..");
        TO_MORSE.put('M', "--");
        TO_MORSE.put('N', "-.");
        TO_MORSE.put('O', "---");
        TO_MORSE.put('P', ".--.");
        TO_MORSE.put('Q', "--.-");
        TO_MORSE.put('R', ".-.");
        TO_MORSE.put('S', "...");
        TO_MORSE.put('T', "-");
        TO_MORSE.put('U', "..-");
        TO_MORSE.put('V', "...-");
        TO_MORSE.put('W', ".--");
        TO_MORSE.put('X', "-..-");
        TO_MORSE.put('Y', "-.--");
        TO_MORSE.put('Z', "--..");
        TO_MORSE.put('1', ".----");
        TO_MORSE.put('2', "..---");
        TO_MORSE.put('3', "...--");
        TO_MORSE.put('4', "....-");
        TO_MORSE.put('5', ".....");
        TO_MORSE.put('6', "-....");
        TO_MORSE.put('7', "--...");
        TO_MORSE.put('8', "---..");
        TO_MORSE.put('9', "----.");
        TO_MORSE.put('0', "-----");
        TO_MORSE.put('.', ".-.-.-");
        TO_MORSE.put(',', "--..--");
        TO_MORSE.put('?', "..--..");

        for (Map.Entry<Character, String> entry : TO_MORSE.entrySet()) {
            FROM_MORSE.put(entry.getValue(), entry.getKey());
        }
    }

}
