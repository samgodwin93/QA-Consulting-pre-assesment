import java.util.Scanner; //Importing the required libraries

public abstract class Ticket 
{
	protected int Price; //Decleration of variables required 
	protected String Type;
	private int Quantity;


	public int getPrice()
		{
			return Price; // So when the price is requested by the main class this encapsulation allows the ticket class to provide the correct price even though the variables are protected
		}

	public void setQuantity() 
		{
			Quantity = 0;
			Scanner scanner = new Scanner(System.in); //Uses the scanner untility to ask the user for a quantity and then assigns it to the relevent variable
			System.out.println("How many " + Type + " tickets would you like?:");
			Quantity = scanner.nextInt();
			System.out.println("You Have ordered " + Quantity + " " + Type + " Ticket.");
		}
    
	public int getQuantity()
		{
			return Quantity; //Another encapsulation to make aqusition of the variables easier for the main class
		}
}