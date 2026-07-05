public class PokerGame {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        // Deal two hands
        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];
        for (int i = 0; i < 5; i++) hand1[i] = deck.dealCard();
        for (int i = 0; i < 5; i++) hand2[i] = deck.dealCard();

        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println(c);
        evaluate(hand1);

        System.out.println("\nHand 2:");
        for (Card c : hand2) System.out.println(c);
        evaluate(hand2);
    }

    static void evaluate(Card[] hand) {
        if (DeckOfCards.hasFourOfKind(hand)) System.out.println("Four of a Kind");
        else if (DeckOfCards.hasFullHouse(hand)) System.out.println("Full House");
        else if (DeckOfCards.hasFlush(hand)) System.out.println("Flush");
        else if (DeckOfCards.hasStraight(hand)) System.out.println("Straight");
        else if (DeckOfCards.hasThreeOfKind(hand)) System.out.println("Three of a Kind");
        else if (DeckOfCards.hasTwoPairs(hand)) System.out.println("Two Pairs");
        else if (DeckOfCards.hasPair(hand)) System.out.println("Pair");
        else System.out.println("High Card");
    }
}
