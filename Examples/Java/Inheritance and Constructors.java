//Klasa 1
public class Flight{
	//other members elided for clarity
	private int flightNumber;

	public Flight(){}
	public Flight(int flightNumber){
		this.flightNumber = flightNumber;
	}
}

//Klasa 2
public class CargoFlight extends FLight{
	//other members elided for clarity
}

//Pozivanje izvan Klase
Flight f175 = new Flight(175);
CargoFlight cf = new CargoFlight();
CargoFlight cf294 = new CargoFlight(295); //Neće se moći izvršiti pošto nemamo konstruktor unutar proširenja klase CargoFlight

///////////////////////////////////////

//Klasa 1
public class Flight{
	//other members elided for clarity
	private int flightNumber;

	public Flight(){}
	public Flight(int flightNumber){
		this.flightNumber = flightNumber;
	}
}

//Klasa 2
public class CargoFlight extends FLight{
	//other members elided for clarity
	public CargoFlight(int flightNumber){
		super(flightNumber); //Prosljeđuje vrijednost na konstruktor Klase 1
	}
}

//Pozivanje izvan Klase
Flight f175 = new Flight(175);
CargoFlight cf = new CargoFlight(); //Neće se izvršiti pošto nije definiran konstruktor kada se prosljeđuje prazno
CargoFlight cf294 = new CargoFlight(295);

///////////////////////////////////////

//Klasa 1
public class Flight{
	//other members elided for clarity
	private int flightNumber;

	public Flight(){}

	public Flight(int flightNumber){
		this.flightNumber = flightNumber;
	}
}

//Klasa 2
public class CargoFlight extends FLight{
	//other members elided for clarity
	float maxCargoSpace = 1000.0f;

	public CargoFlight(){}

	public CargoFlight(int flightNumber){
		super(flightNumber); //Prosljeđuje vrijednost na konstruktor Klase 1
	}

	public CargoFlight(float maxCargoSpace){
		this.maxCargoSpace = maxCargoSpace; //!!! Prvo se poziva prazni konstruktor Parent klase te se zatim poziva konstruktor Child klase
	}

	public CargoFlight(int flightNumber, float maxCargoSpace){
		this(flightNumber);
		this.maxCargoSpace = maxCargoSpace;
	}
}

//Pozivanje izvan Klase
Flight f175 = new Flight(175);
CargoFlight cf = new CargoFlight();
CargoFlight cf294 = new CargoFlight(295);