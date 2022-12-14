import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class Blackjack {

    private static final HashSet<String> faceCards = new HashSet<String>(Arrays.asList("ten", "jack","queen", "king"));
    private static final Map<String, Integer> cardValues = Map.of("ace", 11, "one", 1, "two", 2, "three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);

    public int parseCard(String card) {
        if (faceCards.contains(card)) return 10;
        return cardValues.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) return "P";
        if (dealerScore < 10) return "W";
        return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore <= 11) return "H";
        if (handScore >= 17) return "S";
        if (dealerScore >= 7) return "H";
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
