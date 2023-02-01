package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Cody Labelle Feb 1, 2023
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random rand = new Random();

        // fill hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(rand.nextInt(13) + 1);
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = card;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a card value 1-13 (11 for Jack, 12 for Queen, 13 for King): ");
        int value = scan.nextInt();
        System.out.print("Pick a card suit 1-4 (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        int suit = scan.nextInt();
        scan.close();

        // create user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit-1]);

        // search the hand for the user's card
        for (Card card : hand) {
            if (card.getValue()==userCard.getValue() & card.getSuit()==userCard.getSuit()) {
                printInfo();
                break;
            }
            else {
                System.out.println("Sorry, your card was not in the hand.");
                break;
            }
        } 
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Cody");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get a job as a software developer");
        System.out.println("-- Be happy");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Sports");
        System.out.println("-- Video Games");
        System.out.println("-- Fashion");

        System.out.println();
        
    
    }

    
}
