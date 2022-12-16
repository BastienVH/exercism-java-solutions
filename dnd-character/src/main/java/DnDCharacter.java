import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DnDCharacter {

    int ability() {
        return getDiceThrows();
    }
    
    int modifier(int input) {
        return (int) Math.floor(((double) input - 10) / 2);
    }
    
    int getStrength() {
        return getDiceThrows();
    }
    
    int getDexterity() {
        return getDiceThrows();
    }
    
    int getConstitution() {
        return getDiceThrows();
    }
    
    int getIntelligence() {
        return getDiceThrows();
    }
    
    int getWisdom() {
        return getDiceThrows();
    }
    
    int getCharisma() {
        return getDiceThrows();
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    private static int throwDice() {
        return (int) Math.random() * 6 + 1;
    }

    private static int getDiceThrows() {
        int[] diceThrows = new int[4];
        for (int i = 0; i < 4; i++) {
            diceThrows[i] = throwDice();
        }
        return Arrays.stream(diceThrows).sorted().limit(3).sum();
    }

}
