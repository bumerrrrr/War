/**
 * P-1
 * Description of the project
 *
 * @author Shen Groppel
 * @version 9-1-22
 */

import java.util.ArrayList;

 public class Player
    {
     private ArrayList<Card> cards;

/**
*/
    public Player()
        {
         cards = new ArrayList<Card>();
        }
    
    public ArrayList<Card> getArrayList()
       {
        return cards;
       }
    }
