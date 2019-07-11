//Klasa
class Flight{
	//other members elided for clarity
	int passengers;
	void add1Passenger(){
		if(hasSeating()){
			passengers += 1;
			allPassengers += 1;
		}
		else{
			handleTooMany(); 
		}
	}
	static int allPassengers;
	static int getAllPassengers(){
		return allPassengers;
	}
	static int resetAllPassengers(){
		allPassengers = 0;
	}
}

//Pozivanje izvan klase
Flight.resetAllPassengers();

System.out.println(Flight.getAllPassengers()); //0

Flight lax045 = new Flight();

lax045.add1Passenger();
System.out.println(lax045.getPassengers()); //1
System.out.println(Flight.getAllPassengers()); //1

lax045.add1Passenger();
System.out.println(lax045.getPassengers()); //2
System.out.println(Flight.getAllPassengers()); //2

Flight slc015 = new Flight();

slc015.add1Passenger();
System.out.println(slc015.getPassengers()); //1
System.out.println(lax045.getPassengers()); //2
System.out.println(Flight.getAllPassengers()); //3

//Pozivanje izvan klase 2
import static com.pluralsight.travel.Flight.resetAllPassengers;
import static com.pluralsight.travel.Flight.getAllPassengers;

/*Flight. - više nije potrebno*/resetAllPassengers();

System.out.println(/*Flight. - više nije potrebno*/getAllPassengers()); //0

Flight lax045 = new Flight();

lax045.add1Passenger();
System.out.println(lax045.getPassengers()); //1
System.out.println(/*Flight. - više nije potrebno*/getAllPassengers()); //1

lax045.add1Passenger();
System.out.println(lax045.getPassengers()); //2
System.out.println(/*Flight. - više nije potrebno*/getAllPassengers()); //2

Flight slc015 = new Flight();

slc015.add1Passenger();
System.out.println(slc015.getPassengers()); //1
System.out.println(lax045.getPassengers()); //2
System.out.println(/*Flight. - više nije potrebno*/getAllPassengers()); //3