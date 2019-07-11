public class Flight{
	private int passengers, flightNumber, seats = 150;
	private char flightClass;
	private boolean[] isSeatAvailable;
	
	{
	isSeatAvailable = new boolean[seats];
		for(int i = 0; i < seats; i++)
			isSeatAvailable[i] = true;
	}

	public Flight(){
		//seats = 150;
		//passengers = 0;		
	}

	public Flight(int flightNumber) {
		this();
		this.flightNumber = flightNumber;
	}

	public Flight(char flightClass) {
		this();
		this.flightClass = flightClass;
	}

}

//Klasa
public class OverInitializedClass{
	private int theField = 1;
	
	public int getTheField() {
		return theField;
	}
}

//Pozivanje izvan Klase
OverInitializedClass c = new OverInitializedClass();
System.out.println(c.getTheField()); //1

//Klasa
public class OverInitializedClass{
	private int theField = 1;
	
	public int getTheField() {
		return theField;
	}

	{
		theField = 2;
	}
}

//Pozivanje izvan Klase
OverInitializedClass c = new OverInitializedClass();
System.out.println(c.getTheField()); //2

//Klasa
public class OverInitializedClass{
	private int theField = 1;
	
	public int getTheField() {
		return theField;
	}

	{
		theField = 2;
	}

	public OverInitializedClass() {
		theField = 3;
	}
}

//Pozivanje izvan Klase
OverInitializedClass c = new OverInitializedClass();
System.out.println(c.getTheField()); //3