import java.util.Scanner; import java.util.Scanner; //Importing the required libraries
import java.util.Calendar;

public class Date 
{
	protected int Year; // Declerations
	protected int Month;
	protected int Day;
	protected int DayVal;
 
	public void setDate() 
		
		{	
    
			Scanner Dscanner = new Scanner(System.in);
			System.out.println("What Day would you like to book tickets for? (DD):");
			Day = Dscanner.nextInt(); // Scanners to assign values to each of the Day Month and Year part of the date
    

			Scanner Mscanner = new Scanner(System.in);
			System.out.println("What Month would you like to book tickets for? (MM):");
			Month = Mscanner.nextInt();
    

			Scanner Yscanner = new Scanner(System.in);
			System.out.println("What Year would you like to book tickets for? (YYYY):");
			Year = Yscanner.nextInt();

			Calendar cal=Calendar.getInstance();
			System.out.println("You have chosen: " + Day + "/" + Month + "/" + Year); // Combining the inputs and printing for confermation and error testing
			Month = Month - 1; //as the months range from 0-11 in this utility 1 must be subtracted from the month variable
			cal.set(Year, Month, Day);
			DayVal = cal.get(Calendar.DAY_OF_WEEK); //Outputs the day of the week as an integer 1 = Sunday, 2 = Monday, 3 = Tuesday and so on
		}

	public int getDate()
		{
			return DayVal; //Encapsulation
		} 	

}