1
public class Flight{
	int seats = 150, passengers;
	int totalCheckedBags;
	int maxCarryOns = seats * 2, totalCarryOns;

	private boolean hasSeating(){
		return passengers < seats;
	}

	private boolean hasCarryOnSpace(int carryOns){
		return totalCarryOns + carryOns <= maxCarryOns;
	}

	public void add1Passenger(){
		//if(passengers < seats)
		if(hasSeating())
			passengers += 1;
		else
			handleTooMany();
	}

	public void add1Passenger(int bags){
		if(hasSeating()){
			add1Passenger();
			totalCheckedBags += bags;
		}
	}

	public void add1Passenger(Passenger p){
		add1Passenger(p.getCheckedBags());
	}

	public void add1Passenger(int bags, int carryOns){
		if(hasSeating() && hasCarryOnSpace(carryOns)){
			add1Passenger(bags());
			totalCarryOns += carryOns;
		}
	}

	public void add1Passenger(Passenger p, int carryOns){
		add1Passenger(p.getCheckedBags(), carryOns);
	}
}

2
//Klasa
public class Flight{
	//other members elided for clarity

	public void add1Passenger(){
		...
	}

	public void add1Passenger(int bags){
		...
	}

	public void add1Passenger(Passenger p){
		...
	}

	public void add1Passenger(int bags, int carryOns){
		...
	}

	public void add1Passenger(Passenger p, int carryOns){
		...
	}
}

//Pozivanje izvan Klase
Flight f = new Flight();
Passenger p1 = new Passenger(0/*Free checked bags*/,1/*Checked bags*/);
Passenger p2 = new Passenger(0,2);

f.add1Passenger(); //Izvršava se add1Passenger()
f.add1Passenger(2); //Izvršava se add1Passenger(int bags)
f.add1Passenger(p1); //Izvršava se add1Passenger(Passenger p)

short threeBags = 3;
f.add1Passenger(threeBags, 2); //Izvršava se add1Passenger(int bags, int carryOns) nakon automatskog pretvaranja iz short-a u int
f.add1Passenger(p2, 1); //Izvršava se add1Passenger(Passenger p, int carryOns)

