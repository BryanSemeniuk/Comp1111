/**
 * 
 */
package p1;

/**
 * @author Bryan
 *
 */
public class cards {
    
    enum Rank {ace, two, three, four, five, six, seven, eight, 
               nine, ten, jack, queen, king
               
        }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //declare variables of type rank
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;
       
        
        //assign cards values
        highCard = Rank.ace;
        faceCard = Rank.jack;
        card1 = Rank.two;
        card2 = Rank.three;
        
        //get values for card1 and card2
        int card1val = 1 + card1.ordinal();
        int card2val = 1 + card2.ordinal();
        
                
        //print a black jack hand
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        System.out.println("Hand Value: " + (card1val + card2val));
        
    }

}
