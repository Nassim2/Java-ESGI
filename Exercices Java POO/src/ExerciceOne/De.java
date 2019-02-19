package ExerciceOne;

import java.util.Random;

public class De {

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int roll(){
        Random rand = new Random();
        int val;
        val = rand.nextInt(6) + 1;
        return val;
    }
}
