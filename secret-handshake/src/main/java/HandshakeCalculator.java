import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> resultList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            if ((number & 1) == 1) {
                resultList.add(Signal.values()[i]);
            }
            number = number >> 1;
            if (number == 0) break;
        }
        if ((number & 1) == 1) Collections.reverse(resultList);
        return resultList;
    }
}
