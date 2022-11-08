public class Cards
  {
  private int value;
  private String suit;

  public Cards(int myValue, String mySuit)
    {
    value = myValue;
    suit = mySuit;
    }

  public int getValue()
    {
    return value;
    }

  public String getSuit()
    {
    return suit;
    }

  public String toString()
    {
    return ("It is a " + value + ", and the suit is" + suit + ".");
    }
  }
