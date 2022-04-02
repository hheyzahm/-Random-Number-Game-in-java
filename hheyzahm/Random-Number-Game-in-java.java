import java.util.*;
class Main 
{
  public static void display()
  {
    System.out.println("");
    System.out.println("");
    System.out.println("????????????");
    System.out.println("Guess Number");
    System.out.println("????????????");
    System.out.println("");
    System.out.println("");
  }
  public static void main(String[] args) 
  {
    int random, guess;
    Random rand = new Random(); //Random Object for genter Random Number
    Scanner s = new Scanner(System.in);
    random = rand.nextInt(51);
    System.out.println(random);
    while(true)
    {
      display();
      System.out.print("Enter the Numebr : ");
      guess = s.nextInt(); 
		if (random == guess)
		{
      System.out.println("You Win");
			break;
		}
		else if (random > guess)
		{
			System.out.println("Enter Greater Number ");
		}
		else if (random < guess)
		{
      System.out.println("Enter Less Number ");
		}
    }


  }
}
