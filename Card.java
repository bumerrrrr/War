/**
* The code for the card object.  Jack has a value of 11, queen is 12, king is 13, and ACE is 14.
* @author Gary Wang
* @version 1.1
* @update 11/8/2022 1.1 Optimized the toString method.
*/
public class Card
  {
  private int value;
  private String suit;

  /**
  * The constructor of the card object.
  * @param myValue The value of card.  Jack is 11, Queen is 12, King is 13, and ACE is 14.
  * @param muSuit The suit of card.
  */
  public Card(int myValue, String mySuit)
    {
    value = myValue;
    suit = mySuit;
    }

  /**
  * The getter method for the card's value.
  * @return The value of card.
  */
  public int getValue()
    {
    return value;
    }

  /**
  * The getter method for the card's suit.
  * @return The suit of card.
  */
  public String getSuit()
    {
    return suit;
    }

  /**
  * The method to string all the infos of cards.
  * @return Information of card.
  */
  public String toString()
    {
    String info = "";
    if (value <= 10)
      {
      info = ("It is a " + value + ", and the suit is" + suit + ".");
      }
    if (value == 11)
      {
      info = ("It is a Jack, and the suit is" + suit + ".");
      }
    if (value == 12)
      {
      info = ("It is a Queen, and the suit is" + suit + ".");
      }
    if (value == 13)
      {
      info = ("It is a King, and the suit is" + suit + ".");
      }
    if (value == 14)
      {
      info = ("It is an ACE, and the suit is" + suit + ".");
      }
    return info;
    }
  }
