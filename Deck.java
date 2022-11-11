import java.util.ArrayList;
 public class Deck
    {
    private ArrayList<Card> cardDeck;

    public Deck()
      {
      cardDeck = new ArrayList<Card>();
      }

    public void shuffleAndFill()
     {
     String tempSuit = "";
     for (int i = 0; i < 4; i++)
      {
      if (i == 0)
       {
       tempSuit = "Hearts";
       }
      if (i == 1)
       {
       tempSuit = "Spades";
       }
    if (i == 2)
      {
      tempSuit = "Diamonds";
      }
    if (i == 3)
      {
      tempSuit = "Clubs";
      }
    for (int x = 2; x <= 14; x++)
      {
      cardDeck.add(new Card(i, tempSuit));
      }
    }
    int val = 0;
    for (int i = 0; i < 10000; i++)
      {
      val = (int)(51 * Math.random());
      cardDeck.add(cardDeck.remove(val));
      }
  }


    public void dealCards(ArrayList<Card>player1, ArrayList<Card>player2)
    {
    for (int i = 0; i < cardDeck.size(); i++)
        {
        if(i%2 == 0)
           {
           player1.add(cardDeck.get(i));
           }
        else
          {
           player2.add(cardDeck.get(i));

        }


        }
    }




    }
