/**
 * The base element of the (text-based?) ONU card game.
 * @author Brennon Miller
 */
public class Card {
    // It's safe to make these public because they're immutable.
    public final int value;
    public final int color;

    // Use color names in place of numbers for readability
    public class Color {
        final static int RED = 1;
        final static int YELLOW = 2; 
        final static int GREEN = 3;
        final static int BLUE = 4;
        final static int WILD = 0;
    }

    public class Value {
        final static int SKIP = 10;
        final static int REVERSE = 11;
        final static int DRAW2 = 12;
    }

    /**
     * Constructor
     * Cards are pulled from a shuffled deck, NOT randomly generated.
     * So, the constructor is not randomized; rather, a loop will determine how
     * many of each card is added.
     */
    public Card(int val, int col) {
        /**
         * For normal cards, the number on the card.
         * For special cards, encodes the card's function.
         * For wild cards, indicates whether it is a draw 4 or a normal wild.
         */
        this.value = val;
        this.color = col;
    }

    /**
     * Check for skip card.
     * @return true if card skips next player.
     */
    public boolean isSkip() {
        return (value == 10);
    }

    /**
     * Check for reverse card.
     * @return true if card reverses play order.
     */
    public boolean isReverse() {
        return (value == 11);
    }

    /**
     * Check for draw-two card.
     * @return true if card causes next player to draw two more cards.
     */
    public boolean isDrawTwo() {
        return (value == 12);
    }

    /**
     * Check for wild card.
     * @return true if card can be played on any other card, changing the play color.
     */
    public boolean isWild() {
        return (color == WILD);
    }
}