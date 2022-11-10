/**
 * P-1
 * Description of the project
 *
 * @author Shen Groppel
 * @version 9-1-22
 */

import java.util.ArrayList;

 public class Play
    {
    private ArrayList<Card> player1
    private ArrayList<Card> player2

/**
*/
    public Play(ArrayList<Card> p1, ArrayList<Card> p2)
        {
         player1 = p1;
         player2 = p2;
        }
    
    public String playGame(Deck game, ArrayList<Card> player1, ArrayList<Card> player2)
        {
        int startGame = 0;
        while(startGame < 1)
          {
          int smallestHand = player1.size();
          if(player2.size() < smallestHand)
            smallestHand = player2.size();
          int i = 0;
          while(i < smallestHand)
            {
            Card p1Card = player1.remove(i);
            Card p2Card = player2.remove(i);
            int p1Num = p1card.getValue();
            int p2Num = p2Card.getValue();
            if(p1Num > p2Num)
              {
              player1.add(p1card);
              player1.add(p2card);
              }
            if(p2num > p1Num)
              {
              player2.add(p1card);
              player2.add(p1card);
              }
//tie val
            
            if(p1Num == p2Num)
              {
              boolean equal = true;
              ArrayList<Card> overTime1 = new ArrayList<Card>();
               ArrayList<Card> overTime2 = new ArrayList<Card>();
              while(equal == true)
               {
               
//think i have to add ArrayList to stack
              Card p1Cover = player1.remove(i);
              Card p2Cover = player2.remove(i);
              Card p1Show = player1.remove(i);
              Card p2Show = player2.remove(i);
              }
            }
           
          }
        }
