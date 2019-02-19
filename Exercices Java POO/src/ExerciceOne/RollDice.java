package ExerciceOne;

public class RollDice {
    public static void main(String[] args) {
        De dice = new De();

        int nb_throw = Integer.parseInt(args[0]);

        for (int i = 0; i < nb_throw; i++) {
            int dice1 = dice.roll();
            int dice2 = dice.roll();

            System.out.println("Throw number " + (i + 1) + " results : Dice 1 : " + dice1 + " Dice 2 : " + dice2);

            if(dice1 == dice2)
                System.out.println("You won !");
            else
                System.out.println("Try again !");
        }
    }
}
