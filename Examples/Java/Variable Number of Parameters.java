//Klasa
public class Flight{
	// other members elided for clarity
	public void addPassengers(Passenger[] list){
		if(hasSeating(list.length)){
			passengers += list.length;
			for (Passenger passenger : list) {
				passenger.getCheckedBabg();
			}
		}else{
			handleTooMany();
		}
	}

	private boolean hasSeating(int count){
		return passengers + count <= seats;
	}
}

//Pozivanje izvan klase
Flight f = new Flight();
Passenger janet = new Passenger(0,1);
Passenger john = new Passenger(0,2);
f.addPassengers(new Passenger[] {janet, john});
Passenger fred = new Passenger(0,2);
Passenger sarah = new Passenger(0,2);
Passenger susie = new Passenger(0,0);
f.addPassengers(new Passenger[] {fred, sarah, susie});

//Klasa
public class Flight{
	// other members elided for clarity
	public void addPassengers(Passenger... list){
		if(hasSeating(list.length)){
			passengers += list.length;
			for (Passenger passenger : list) {
				passenger.getCheckedBabg();
			}
		}else{
			handleTooMany();
		}
	}

	private boolean hasSeating(int count){
		return passengers + count <= seats;
	}
}

//Pozivanje izvan klase
Flight f = new Flight();
Passenger janet = new Passenger(0,1);
Passenger john = new Passenger(0,2);
f.addPassengers(janet, john);
Passenger fred = new Passenger(0,2);
Passenger sarah = new Passenger(0,2);
Passenger susie = new Passenger(0,0);
f.addPassengers(fred, sarah, susie);