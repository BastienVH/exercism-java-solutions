import java.io.Console;

class ReverseString {

    String reverse(String inputString) {
        String result = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            result += inputString.substring(i, i + 1);
        }
        return result;
    }
  
}
