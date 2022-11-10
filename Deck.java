import java.util.ArrayList;
 public class Deck
    {
    private ArrayList<Card> deck;
    private int topCard;
  
    public void shuffle()
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
      Deck.add(new Card(i, tempSuit));
      }
    }
  }
   
  
    public void dealCard(ArrayList<Card>player1, ArrayList<Card>player2)
    {
    for (int i = 0; i < deck.length; i++)
        {
        if(i%2 == 0)
           {
           player1.add(deck[i]);
           }
        else
          {
           player2.add(deck[i]);
         
        }
        
        
        }
    }
  
  
  
  
    }
    
