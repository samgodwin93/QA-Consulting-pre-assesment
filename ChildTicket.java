public class ChildTicket extends Ticket 
{

	public ChildTicket()
		{
			Price = 4;
			Type = "Child"; //The lowest class these values are inherited into the ticket class to provied it with the correct valuse for the calculations
		}
}