//Interface Iterable
public interface Iterable<T>{
	Iterator<T> iterator();
}

//Interface Iterator
public interface Iterator<>{
	boolean hasNext();
	T next();
}

//Primjer 1

//Klasa
public class Flight implements Comparable<Fligh>, Iterable<Person>{
	//other members elided for clarity
	private int flightTime; //minutes past midnight
	private CrewMember[] crew;
	private Passenger[] roaster;

	public int compareTo(/*Object o- nije više potrebno*/Flight f){
		//Flight f = (Flight) o; - Nije vise potrebno
		return flightTime - f.flightTime;
	}

	public Iterator<Person> iterator(){
		return new FlightIterator(crew, roaster);
	}
}

//Klasa 2
public class Person{
	//other members elided for clarity
	private String name;
}

//Klasa 3
public class CrewMember extends Person{
	//members elided for clarity
}

//Klasa 4
public class Passenger extends Person implements Comparable<Passenger>{
	//members elided for clarity

}

//Klasa 5
public class FlightIterator implements Iterator<Person>{
	private CrewMember[] crew;
	private Passenger[] roaster;
	private int index = 0;

	public FlightIterator(CrewMember[] crew, Passenger[] roaster){
		this.crew = crew;
		this.roaster =  roaster;
	}

	boolean hasNext(){
		return index < (crew.length + roaster.length);
	}

	public Person next(){
		Person p = (index < crew.length) ? crew[index] : roaster[index - crew.length];
		index++;
		return p;
	}
}

//Pozivanje izvan Klase
Flight lax045 = new Flight(45);

//Add crew members:
//Pilot Patty, CoPilot Karl, Marshal Mary

//Add Passengers:
//Bob, Jane, Steve, Lisa

for(Person p:lax045){
	System.out.println(p.getName()); //Pilot Patty, CoPilot Karl, Marshal Mary, Bob, Jane, Steve, Lisa
}

//Što se događa u pozadini for petlje:
Iterable<Person> laxIterable = lax045;
Iterator<Person> persons = laxIterable.iterator();
while(persons.hasNext()){
	Person p = persons.next();
	System.out.println(p.getName());
}