package BR;/*

This is BetterRandom. It's just a simple class that I developed to allow better randomization functions
You can get random booleans, ints, floats, doubles.
You can also roll a die, you can also set how many sides it has.
With randomInt you can set a min and max. This means you can easily generate a better random number. You can use positive or negative numbers for this.
More to come to be added. I also added Rock(-1), Paper(0), and Scissors(1) to this as well

Developed by Bryce Sheridan
Version: 0.1

 */
import java.util.Random;

public class BetterRandom {

    // Fixed public and private declaration
    private double booleanTruePercentage = 0.5;
    private boolean flipFlopValue = false;
    private int diceSides = 6; // This is the default dice sides. You can change with CLASS.setDiceSides(SIDES);
    private int seed;
    private static int MAX_RANDOM_INT = 999999; // Max values a random int can generate too


    Random rand = new Random();

    public BetterRandom() {
        this.seed = this.randomInt(this.randomInt(100,999), this.randomInt(1000, 9999)); // generate a random seed
    }

    public int getSeed() {
        if (seed == 0) {
            return -1; // Will return -1 if seed is not set
        } else {
            return seed;
        }
    }

    public int randomIntSeed() {
        System.out.println("Seed: " + this.seed);
        int randomNumber = this.randomInt(this.seed, (this.seed * 2) / (this.seed % 3) + 1 );
        this.seed = this.seed + this.randomInt(1000, 9999);
        return randomNumber;
    }

    public int randomInt(int min, int max) {
        int calculatedRange = (max - min + 1) + min;
        int randomNumber;
        do {
            randomNumber = rand.nextInt(calculatedRange);
        } while(randomNumber == min -1 || randomNumber == max + 1); // This is a check to make sure that the number generated is not less than the range
        return randomNumber;
    }

    // Added support for 0-arity method for randomInt
    public int randomInt() {
        return this.randomInt(0, MAX_RANDOM_INT);
    }

    public boolean randomBoolean() {
        return !(Math.random() > booleanTruePercentage);
    }

    public void setBooleanTruePercentage(double percentage) {
        this.booleanTruePercentage = percentage;
    }

    public boolean booleanFlipFlop() {
        if (this.flipFlopValue) {
            return this.flipFlopValue = false; // Just condensed this into one line
        } else {
            return this.flipFlopValue = true; // Just condensed this into one line
        }
    }

    public int rockPaperScissors() {
        // This will return -1, 0, 1.
        // -1 = Rock
        // 0 = Paper
        // 1 = Scissors
        return randomInt(-1, 1);
    }

    public void setDiceSides(int sides) {
        this.diceSides = sides;
    }

    public int rollDice() {
        return this.randomInt(1, this.diceSides);
    }

    public float randomFloat() {
        return rand.nextFloat();
    }

    public double randomDouble() {
        return rand.nextDouble();
    }

}
