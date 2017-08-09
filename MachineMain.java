
public class MachineMain 
{
    
	StudentTicket ST;
	AdultTicket AT;
	OAPTicket OT;
	ChildTicket CT;
	Date D;

	

	public static void main (String[] args) 
		{

			Ticket ST = new StudentTicket(); //Creating 4 seperate ticket abstract classes each of which inherits values from a different class  e.g. this one creats the ticket abstract with the student class inheritance 
			Ticket AT = new AdultTicket();
			Ticket CT = new ChildTicket();
			Ticket OT = new OAPTicket();
			Date D = new Date(); // Create the class within which the date for the booking is set
	
			D.setDate(); // Runs the Method called setDate within the Date class
	
			ST.setQuantity(); // Runs the SetQuantity method in all 4 ticket classes that were created each of which use the different extention
			AT.setQuantity();
			CT.setQuantity();
			OT.setQuantity();

			int DayVal = D.getDate(); //The getDate method simply returns the Date value as assigned within the Date class and here it is assigned to a new variable within this class
			int STotal = ST.getPrice() * ST.getQuantity(); // Just pulling the price and quantity from the 4 ticket classes and mutiplying them to find the total.
			int CTotal = CT.getPrice() * CT.getQuantity();
			int OTotal = OT.getPrice() * OT.getQuantity();
			int ATotal = AT.getPrice() * AT.getQuantity();
			int Total = ATotal + CTotal + OTotal + STotal;

			if (DayVal == 4)  // As the setDate method creates a number based on the day of the week 1 = Sunday, 2 = Monday, 3 = Tuesday and so on this if statment tests to see if the date that was set is a Wednesday and if so applies the discount if not a Wednesday the else is executed. 
				{

					int TQuantity = ST.getQuantity() + CT.getQuantity() + OT.getQuantity() + AT.getQuantity();
					Total = Total - 2 * TQuantity;
      					System.out.println("As you have booked for a Wednesday all tickets are £2 off.  Your total is: £" + Total );
			 
				}

			else 

				{

            				System.out.println("That will cost £" + Total );

        			}
	
		}
}