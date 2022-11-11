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
          int timesRun = 0;
          while(timesRun < smallestHand)
            {
            Card p1Card = player1.remove(0);
            Card p2Card = player2.remove(0);
            int p1Num = p1card.getValue();
            int p2Num = p2Card.getValue();
            timesRun = this.EvalRoundW(timesRun, p1Num, p2Num);
            }
          }
        }

    public static int EvalRoundW(int timesRun, int p1Num, int p2Num)
      {
        if(p1Num > p2Num)
          {
          player1.add(p1card);
          player1.add(p2card);
          timesRun++;
          }
        if(p2num > p1Num)
          {
          player2.add(p1card);
          player2.add(p1card);
          timesRun++;
          }
  //tie val
        if(p1Num == p2Num)
          {
          ArrayList<Card> overTime1 = new ArrayList<Card>();
          ArrayList<Card> overTime2 = new ArrayList<Card>();
          overTime1.add(p1Num);
          overTime2.add(p2Num);
          int x = 0;
          while(x < 1)
            {
            overTime1.add(player1.remove(0));
            Card showCard1 = player1.remove(0));
            int showNum1 = showCard1.getValue();
            timesRun++;
            overTime2.add(player2.remove(0));
            Card showCard2 = player2.remove(0));
            int showNum2 = showCard2.getValue();
            timesRun++;
            int winner = this.EvalOTW(showNum1, showNum2);
            if(winner != 3)
              {
              this.fillOTWin(winner, overTime1, overTime2)
              x++;
              }
            }
          }
      }

    public static void EvalOTW(int showNum1, int showNum2)
      {
      if(showNum1 < showNum2)
        { return 2 }
      if(showNum2 < showNum1)
        { return 1 }
      if(showNum1 == showNum2)
        { return 3 }
      }

    public void fillOTWin(int result, ArrayList<Card> oT1, ArrayList<Card> oT2)
      {
      if(result == 1)
        {
        for(int i = 0; i < ot1.size(); i++)
          {
          player1.add(ot1.get(i));
          player1.add(ot2.get(i));
          }
        }
      if(result == 2)
        {
        for(int i = 0; i < ot2.size(); i++)
          {
          player2.add(ot2.get(i));
          player2.add(ot1.get(i));
          }
        }
      }
    }
