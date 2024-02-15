public class MorseCodeTranslator {

    public static String toMorse(String input) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            if (c == ' ') {
                sb.append("/ ");
            } else {
                String morse = MorseCodeHashmaps.TO_MORSE.get(c);
                if (morse == null) {
                    throw new IllegalArgumentException("Invalid character: " + c);
                }
                sb.append(morse).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String fromMorse(String input) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        for (String code : input.trim().split("\\s+")) {
            if (code.equals("/")) {
                sb.append(" ");
            } else if (!code.isEmpty()) {
                Character c = MorseCodeHashmaps.FROM_MORSE.get(code);
                if (c == null) {
                    throw new IllegalArgumentException("Invalid Morse code: " + code);
                }
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
