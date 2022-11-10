import java.util.ArrayList;
 public class Deck
    {
    private ArrayList<Card> deck;
    private int topCard;
  
  

  
    public void shuffle() 
    {
   
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
    
