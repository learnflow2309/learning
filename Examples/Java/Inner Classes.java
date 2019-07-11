//Klasa
public class Flight implements Comparable<Flight>, Iterable<Person>{
	//other members elided for clarity
	private CrewMember[] crew;
	private Passenger[] roster;

	public Iterator<Person> iterator(){
		return new FlightIterator(/*crew, roster - više nije potrebno*/);
	}

	private class FlightIterator implements Iterator<Person>{
		private int index = 0;

		public boolean hasNext(){
			return index < (crew.length + roster.length);
		}

		public Person next(){
			Person p = (index < crew.length) ? crew[index] : roster[index - crew.length]; //Flight.this - Mogućnost Nestane klase da pristupa članovima Instance klase u kojoj je stvorena
			index++; //this - Mogućnost Nestane klase da pristupa svojim članovima
			return p;
		}
	}
}

//Pomoćna klasa
/*public class FlightIterator implements Iterator<Person>{
	private CrewMember[] crew;
	private Passenger[] roster;
	private int index = 0;
	
	public FlightIterator(CrewMember[] crew, Passenger[] roster){
		this.crew = crew;
		this.roster = roster;
	}

	public boolean hasNext(){
		return index < (crew.length + roster.length);
	}

	public Person next(){
		Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
		index++;
		return p;
	}
} - više nije potrebno*/