package BR;

/*

This is sort of a template class to show how to use all the methods of BetterRandom

 */

public class Main {

    public static void main(String[] args) {

        BetterRandom random = new BetterRandom();
        System.out.println(random.randomInt(0, 10)); // Gives you a number between two integer values
        System.out.println(random.randomBoolean()); // Gives you a random boolean.

        random.setBooleanTruePercentage(0.5); // You can set the percentage of trues for random booleans. 0.00 - 1.00 DEFAULT: 0.50
        for (int i = 0; i < 40; ++i) {
            System.out.print(random.randomBoolean());
        }
        System.out.println();

        // Boolean Flip Flop
        for (int i = 0; i<20; ++i) {
            System.out.print(random.booleanFlipFlop());
        }

        System.out.println("Roll a dice");
        for (int i = 0; i<20; ++i) {
            System.out.print(random.rollDice() + "  ");
        }

        // You can set the sides of the dice
        random.setDiceSides(10);
        System.out.println();
        for (int i = 0; i<20; ++i) {
            System.out.print(random.rollDice() + "  ");
        }

        System.out.println();
        System.out.println(random.randomFloat());

        System.out.println();
        System.out.println(random.randomDouble());


    }

}

