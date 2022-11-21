import java.util.ArrayList;
import java.util.Scanner;

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

    public String playGame()
        {
        //Scanner keyboard = new Scanner(System.in);
        int startGame = 0;
        Card p1Card = new Card(0, " ");
        Card p2Card = new Card(0, " ");
        int p1Num = 0;
        int p2Num = 0;
        int p1Size = player1.size();
        int p2Size = player2.size();
        int smallestHand = p1Size;
        System.out.println(player1);
        System.out.println(player2);
        String go = "";
          while(player1.size() != 0 || player2.size() != 0)
            {
            //System.out.println("go again? Y/N");
            //go = keyboard.nextLine();
            //if(go.equals("Y"))
            //{
            if(player1.isEmpty() == true)
              {
              System.out.println(("Player 2 wins"));
              return ("Player 2 wins");
              }
            if(player2.isEmpty() == true)
              {
              System.out.println(("Player 1 wins"));
              return ("Player 1 wins");
              }
            // System.out.println("P1" + player1.size());
            // System.out.println("P2" + player2.size());
            p1Card = player1.remove(0);
            System.out.println(p1Card.toString());
            p2Card = player2.remove(0);
            System.out.println(p2Card.toString());
            p1Num = p1Card.getValue();
            p2Num = p2Card.getValue();
            this.evalRoundW(p1Num, p2Num, p1Card, p2Card);
            // if(player1.isEmpty() == true)
            //   { return ("Player 2 wins"); }
            // if(player2.isEmpty() == true)
            //   { return ("Player 1 wins"); }
            //}
            System.out.println("P1" + player1.size());
            System.out.println("P2" + player2.size());
            }
        return p1Card.toString() + p2Card.toString();
        }

    public void evalRoundW(int p1Num, int p2Num, Card p1Card,Card p2Card)
      {
        if(p1Num > p2Num)
          {
          player1.add(p2Card);
          player1.add(p1Card);
          System.out.println("Player1 fill");
          }
        if(p2Num > p1Num)
          {
          player2.add(p1Card);
          player2.add(p2Card);
          System.out.println("player 2 fill");
          }
  //tie val
        if(p1Num == p2Num)
          {
          ArrayList<Card> overTime1 = new ArrayList<Card>();
          ArrayList<Card> overTime2 = new ArrayList<Card>();
          System.out.println("OVERTIME");
//no add card
          int x = 0;
          Card showCard1 = new Card(0, " ");
          Card showCard2 = new Card(0, " ");
          int showNum1 = 0;
          int showNum2 = 0;
          int winner = 0;
          if(player1.isEmpty() == true || player2.isEmpty() == true)
            {
            System.out.println("work 1");
            showCard1 = p1Card;
            showCard2 = p2Card;
            showNum1 = showCard1.getValue();
            showNum2 = showCard2.getValue();
            System.out.println("num 1" + showNum1);
            System.out.println("num 2" + showNum2);
            winner = this.evalOTW(showNum1, showNum2);
            System.out.println("winner" + winner);
            this.fillOtTie(winner, showCard1, showCard2);
            System.out.println(player1.size());
            System.out.println(player2.size());
            System.out.println("end");
            x = 1;
            }
          else
            {
            overTime1.add(p1Card);
            overTime2.add(p2Card);
            while(x < 1)
              {
              if(player1.size() == 1 || player2.size() == 1)
                {
                System.out.println("work");
                showCard1 = overTime1.get(0);
                showCard2 = overTime2.get(0);
                showNum1 = showCard1.getValue();
                showNum2 = showCard2.getValue();
                System.out.println("num 1" + showNum1);
                System.out.println("num 2" + showNum2);
                winner = this.evalOTW(showNum1, showNum2);
                System.out.println("winner" + winner);
                this.fillOTWinDouble(winner, overTime1, overTime2);
                System.out.println(player1.size());
                System.out.println(player2.size());
                System.out.println("end");
                x = 1;
                }
              else
                {
                System.out.println("else");
                overTime1.add(player1.remove(0));
                showCard1 = player1.remove(0);
                showNum1 = showCard1.getValue();
                overTime1.add(showCard1);
                overTime2.add(player2.remove(0));
                showCard2 = player2.remove(0);
                showNum2 = showCard2.getValue();
                overTime2.add(showCard2);
                winner = this.evalOTW(showNum1, showNum2);
                if(winner != 3)
                  {
                  this.fillOTWinDouble(winner, overTime1, overTime2);
                  x++;
                  }
                }
              }
          }
          }
      }

    public static int evalOTW(int showNum1, int showNum2)
      {
      if(showNum1 < showNum2)
        { return 1; }
      if(showNum2 < showNum1)
        { return 2; }
      if(showNum1 == showNum2)
        { return 3; }
      return 0;
      }

    public void fillOTWinDouble(int result, ArrayList<Card> oT1, ArrayList<Card> oT2)
      {
      if(result == 1)
        {
        for(int i = 0; i < oT1.size(); i++)
          {
          player1.add(oT1.get(i));
          player1.add(oT2.get(i));
          System.out.println("Hi");
          }
        }
      if(result == 2)
        {
        for(int i = 0; i < oT2.size(); i++)
          {
          player2.add(oT2.get(i));
          player2.add(oT1.get(i));
          System.out.println("Hello");
          }
        }
      if(result == 3)
        {
          for(int i = 0; i < oT2.size(); i++)
            {
            player2.add(oT2.get(i));
            }
          for(int i = 0; i < oT1.size(); i++)
            {
            player1.add(oT1.get(i));
            }
        System.out.println("tie");
        }
      }

    public void fillOtTie(int result, Card showCard1, Card showCard2)
      {
      if(result == 3)
        {
          player2.add(showCard2);
          player1.add(showCard1);
        System.out.println("tie");
        }
      }
    }
