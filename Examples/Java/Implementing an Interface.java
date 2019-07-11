//Primjer 1

//Klasa
public class Passenger implements Comparable{
	//other members elided for clarity
	private int memberLevel; //3(1st priority), 2, 1
	private int memberDays;

	public int compareTo(Object o){
		Passenger p = (Passenger) o;

		if(memberLevel > p.memberLevel){
			return -1;
		}
		else if(memberLevel > p.memberLevel){
			return 1;
		}
		else{
			if(memberDays > p.memberDays){
				return -1;
			}
			else if(memberDays < p.memberDays){
				return 1;
			}
			else{
				return 0;
			}
		}
	}
}

//Pozivanje izvan klase
Passenger bob = new Passenger();
bob.setLevelAndDays(1, 180);

Passenger jane = new Passenger();
jane.setLevelAndDays(1, 90);

Passenger steve = new Passenger();
steve.setLevelAndDays(2, 180);

Passenger lisa = new Passenger();
lisa.setLevelAndDays(3, 730);

Passenger[] passengers = {bob, jane, steve, lisa};

Arrays.sort(passengers); //lisa, steve, bob, jane

//Primjer 2

//Klasa
public class Flight implements Comparable{
	//other members elided for clarity
	private int flightTime; //minutes past midnight

	public int compareTo(Object o){
		Flight f = (Flight) o;

	// duzi primjer
		// if(flightTime < f.flightTime){
		// 	return -1;
		// }
		// else if(flightTime > f.flightTime){
		// 	return 1;
		// }
		// else{
		// 	return 0;
		// }

	//kraci primjer (radi isto pošto negativna vrijednost stavlja objekt na mjesto prije trenutnog objekta)
		return flightTime - f.flightTime;
	}
}

//Pozivanje izvan klase
Flight lax045 = new Flight();
lax045.setFlightTime(45)

Flight slc015 = new Flight();
slc015.setFlightTime(15)

Flight nyc030 = new Flight();
nyc030.setFlightTime(30)

Flight[] flights = {lax045, slc015, nyc030};

Arrays.sort(flights);