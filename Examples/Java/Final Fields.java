//Klasa
public class Passenger{
	private int freeBags;
	//other members elided for clarity

	public Passenger(int freeBags){
		this.freeBags = freeBags;
	}
}

//Klasa 2
public class Passenger{
	private final int freeBags; //Svaki pokušaj izmjene freeBags nakon što se postavi u Konstruktoru će rezultirati Compile error-om 
	//other members elided for clarity

	public Passenger(int freeBags){
		this.freeBags = freeBags;
	}
}

//////////////////////////////////////////////////////////////

//Klasa
public class Flight{

	private int seats;
	//other members elided for clarity

	public void setSeats(int seats){
		this.seats = seats;
	}
}

//Klasa 2
public class Flight{
	static final int MAX_FAA_SEATS = 550; //Let će uvijek najviše imati 550 sjedala
	private int seats;
	//other members elided for clarity

	public void setSeats(int seats){
		if(seats <= MAX_FAA_SEATS){
			this.seats = seats;
		}

		else{
			//handle error
		}
	}
}