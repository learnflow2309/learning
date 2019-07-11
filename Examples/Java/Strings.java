int iVal = 100;
String sVal = String.valueOf(iVal);

int i = 2, j = 3;
int result = i * j;
System.out.println(i + " * " + j + " = " + result); // "2 * 3 = 6"

//Klasa
//Bez Override-anja

//Pozivanje izvan Klase
Flight myFLight = new Flight(175);
System.out.println("My flight is " + myFlight); //"My flight is com.pluralsight.foo.Flight@74a14482" (puno ime klase, @ znak, vrijednost koja je proslijeđena od strane Hash metode Objekt klase)

//Klasa
public class Flight{
	int flightNumber;
	char flightClass;
	//other members elided for clarity

	@Override
	public String toString(){
		if(flightNumber > 0){
			return "Flight #" + flightNumber;
		}else{
			return "Flight Class " + flightClass;
		}
	}
}

//Pozivanje izvan Klase
Flight myFLight = new Flight(175);
System.out.println("My flight is " + myFlight); //"My flight is Flight #175"