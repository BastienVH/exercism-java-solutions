import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> resultList = new ArrayList<>();
        List<Integer> binNumber = decToBinary(number);
        if (binNumber.size() > 5) {
            binNumber = truncateList(binNumber);
        }

        // check if the order should be reversed
        boolean shouldReverse = false;
        if ((binNumber.size() == 5) && binNumber.get(0) == 1) {
            shouldReverse = true;
            // drop first element (reverser) from list
            binNumber.remove(0);
        }

        int signalIterator = 0;
        // check each bit if it is 1, if so, add correct signal to resultList
        for (int i = binNumber.size() - 1; i >= 0; i--) {
            if (binNumber.get(i) == 1) {
                resultList.add(Signal.values()[signalIterator]);
            }
            signalIterator++;
        }
        if (shouldReverse == true)
            Collections.reverse(resultList);
        return resultList;
    }

    List<Integer> decToBinary(int number) {
        List <Integer> binNumberAsList = new ArrayList<Integer>();
        while (number > 0) {
            binNumberAsList.add(number % 2);
            number = number / 2;
        }
        Collections.reverse(binNumberAsList);
        return binNumberAsList;
    }

    List<Integer> truncateList(List<Integer> longList) {
        while (longList.size() > 5) {
            longList.remove(0);            
        }
        return longList;
    }
}
