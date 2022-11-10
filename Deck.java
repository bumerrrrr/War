import java.util.ArrayList;
 public class Deck
    {
    private Card[] deck
    private int topCard;
    
    deck()
    {
    topCard = 0;
    for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(i);
    }
    
    public void shuffle() 
    {
     topCard = 0;

     for (int i = 0; i < 10000; i++) 
         {
         int p1 = (int)(Math.random()*52);
         int p2 = (int)(Math.random()*52);
         Card temp = deck[j];
         deck[p1] = deck[p2];
         deck[p2] = tmpCard;
         }
    
    
    }
