import javax.swing.text.AttributeSet.CharacterAttribute;

class SqueakyClean {
    static String clean(String inputString) {
        StringBuilder sb = new StringBuilder();

        // loop over every letter in inputString
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (Character.isISOControl(currentChar)) {
                sb.append("CTRL");
            } else if (Character.isWhitespace(currentChar)) {
                sb.append('_');
            } else if (currentChar == '-') {
                char nextChar = inputString.charAt(i+1);
                if (Character.isAlphabetic(nextChar)) {
                    sb.append(Character.toUpperCase(nextChar));
                }
                i++;
            } else if (Character.isLetter(currentChar) && !isLowercaseGreekLetter(currentChar)) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    static boolean isLowercaseGreekLetter(char letter) {
        return (letter >= 'α' && letter <= 'ω');
    }
}