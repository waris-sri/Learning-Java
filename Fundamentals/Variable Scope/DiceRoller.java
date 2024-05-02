// for VariableScope

import java.util.Random;

public class DiceRoller {
    
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        getRandomNumber();
    }

    void getRandomNumber() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}