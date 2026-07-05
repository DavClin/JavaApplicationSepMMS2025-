import java.util.Random;

public class FisherYatesShuffle {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int  i = 0; i < deck.length; i++) deck[i] = i;
        Random rand = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        for (int card : deck) System.out.print(card + " ");
    }
}
