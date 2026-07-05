import java.util.Random;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private Random rand;

    private static final String[] faces = {
        "Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"
    };
    private static final String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        rand = new Random();

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = rand.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) return deck[currentCard++];
        else return null;
    }

    // Poker hand evaluation methods
    public static boolean hasPair(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            for (int j = i+1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) return true;
            }
        }
        return false;
    }

    public static boolean hasTwoPairs(Card[] hand) {
        int pairs = 0;
        for (int i = 0; i < hand.length; i++) {
            for (int j = i+1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) pairs++;
            }
        }
        return pairs >= 2;
    }

    public static boolean hasThreeOfKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int j = i+1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) count++;
            }
            if (count == 3) return true;
        }
        return false;
    }

    public static boolean hasFourOfKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int j = i+1; j < hand.length; j++) {
                if (hand[i].getFace().equals(hand[j].getFace())) count++;
            }
            if (count == 4) return true;
        }
        return false;
    }

    public static boolean hasFlush(Card[] hand) {
        String suit = hand[0].getSuit();
        for (Card c : hand) if (!c.getSuit().equals(suit)) return false;
        return true;
    }

    public static boolean hasStraight(Card[] hand) {
        // Simplified: check consecutive indices
        int[] values = new int[hand.length];
        for (int i = 0; i < hand.length; i++) {
            values[i] = java.util.Arrays.asList(faces).indexOf(hand[i].getFace());
        }
        java.util.Arrays.sort(values);
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i-1] + 1) return false;
        }
        return true;
    }

    public static boolean hasFullHouse(Card[] hand) {
        return hasThreeOfKind(hand) && hasPair(hand);
    }
}
