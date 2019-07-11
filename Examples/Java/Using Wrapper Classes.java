//Klasa
public class Flight{
	int flightNumber;
	char flightClass;
	//other members elided for clarity

	@Override
	public String toString(){
		if(flightNumber > 0){
			return "Flight #" + flightNumber;
		}
		else{
			return "Flight Class " + flightClass;
		}
	}	
}

//Klasa 2
public class Flight{
	Integer flightNumber;
	Character flightClass;
	//other members elided for clarity

	@Override
	public String toString(){
		if(flightNumber != null){
			return "Flight #" + flightNumber;
		}
		else if(flightClass != null){
			return "Flight Class " + flightClass;
		}
		else{
			return "Flight identity not set ";
		}
	}	
}