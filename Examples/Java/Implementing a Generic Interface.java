//Primjer 1

//Klasa
public class Flight implements Comparable<Fligh>{
	//other members elided for clarity
	private int flightTime; //minutes past midnight

	public int compareTo(/*Object o- nije više potrebno*/Flight f){
		//Flight f = (Flight) o; - Nije vise potrebno
		return flightTime - f.flightTime;
	}
}

//Primjer 2


//Klasa
public class Passenger implements Comparable<Passenger>{
	//other members elided for clarity
	private int memberLevel; //3(1st priority), 2, 1
	private int memberDays;

	public int compareTo(/*Object o*/Passenger p){
		// Passenger p = (Passenger) o; - nije više potrebno

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