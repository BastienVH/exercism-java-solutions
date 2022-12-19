import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final Random random;
    private final int strength, dexterity, constitution, intelligence, wisdom, charisma;

    public DnDCharacter() {
        random = new Random();
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }

    int ability() {
        return random.ints(4, 1, 7).sorted().limit(3).sum();
    }
    
    int modifier(int input) {
        return (int) Math.floor(((double) input - 10) / 2);
    }
    
    int getStrength() {
        return strength;
    }
    
    int getDexterity() {
        return dexterity;
    }
    
    int getConstitution() {
        return constitution;
    }
    
    int getIntelligence() {
        return intelligence;
    }
    
    int getWisdom() {
        return wisdom;
    }
    
    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
    
    // private static int throwDice() {
    //     return (int) Math.random() * 6 + 1;
    // }

    // private static int getDiceThrows() {
    //     int[] diceThrows = new int[4];
    //     for (int i = 0; i < 4; i++) {
    //         diceThrows[i] = throwDice();
    //     }
    //     return Arrays.stream(diceThrows).sorted().limit(3).sum();
    // }

}
