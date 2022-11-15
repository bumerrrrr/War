import java.util.ArrayList;

 public class Play
    {
    private ArrayList<Card> player1;
    private ArrayList<Card> player2;

/**
*/
    public Play(ArrayList<Card> p1, ArrayList<Card> p2)
        {
         player1 = p1;
         player2 = p2;
        }

    public String playGame(ArrayList<Card> player1, ArrayList<Card> player2)
        {
        int startGame = 0;
        Card p1Card = new Card(0, " ");
        Card p2Card = new Card(0, " ");
        int p1Num = 0;
        int p2Num = 0;
        int timesRun = 0;
        int p1Size = player1.size();
        int p2Size = player2.size();
        int smallestHand = player1.size();
          while(timesRun < smallestHand)
            {
            System.out.println("Hello!");
            if(p1Size < p2Size)
              {
              p1Size = smallestHand;
              }
            else
              {
              p2Size = smallestHand;
              }
            p1Card = player1.remove(0);
            p2Card = player2.remove(0);
            p1Num = p1Card.getValue();
            p2Num = p2Card.getValue();
            timesRun = this.EvalRoundW(timesRun, p1Num, p2Num, p1Card, p2Card);
            if(player1.isEmpty() == true)
              { return ("Player 2 wins"); }
            if(player2.isEmpty() == true)
              { return ("Player 1 wins"); }
            }


        return p1Card.toString() + p2Card.toString();
        }

    public int EvalRoundW(int timesRun, int p1Num, int p2Num, Card p1Card,Card p2Card)
      {
        if(p1Num > p2Num)
          {
          player1.add(p1Card);
          player1.add(p2Card);
          timesRun++;
          }
        if(p2Num > p1Num)
          {
          player2.add(p1Card);
          player2.add(p1Card);
          timesRun++;
          }
  //tie val
        if(p1Num == p2Num)
          {
          ArrayList<Card> overTime1 = new ArrayList<Card>();
          ArrayList<Card> overTime2 = new ArrayList<Card>();
          overTime1.add(p1Card);
          overTime2.add(p2Card);
          int x = 0;
          Card showCard1 = new Card(0, " ");
          Card showCard2 = new Card(0, " ");
          int showNum1 = 0;
          int showNum2 = 0;
          int winner = 0;
          while(x < 1)
            {
            overTime1.add(player1.remove(0));
            showCard1 = player1.remove(0);
            showNum1 = showCard1.getValue();
            timesRun++;
            overTime2.add(player2.remove(0));
            showCard2 = player2.remove(0);
            showNum2 = showCard2.getValue();
            timesRun++;
            winner = this.EvalOTW(showNum1, showNum2);
            if(winner != 3)
              {
              this.fillOTWin(winner, overTime1, overTime2);
              x++;
              }
            }
          }
      return timesRun;
      }

    public static int EvalOTW(int showNum1, int showNum2)
      {
      if(showNum1 < showNum2)
        { return 2; }
      if(showNum2 < showNum1)
        { return 1; }
      if(showNum1 == showNum2)
        { return 3; }
      return 0;
      }

    public void fillOTWin(int result, ArrayList<Card> oT1, ArrayList<Card> oT2)
      {
      if(result == 1)
        {
        for(int i = 0; i < oT1.size(); i++)
          {
          player1.add(oT1.get(i));
          player1.add(oT2.get(i));
          }
        }
      if(result == 2)
        {
        for(int i = 0; i < oT2.size(); i++)
          {
          player2.add(oT2.get(i));
          player2.add(oT1.get(i));
          }
        }
      }
    }
