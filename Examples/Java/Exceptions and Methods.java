//C:\PassengerList.txt
//2 Wilson //Broj članova grupe i Naziv grupe
//4 Rodriguez
//7 Smith
//4 Sharma

public class Flight{
	int passengers;
	//other members elided for clarity
	public void addPassenger(String filename) throws IOException{ //Posto FileReader moze izbaciti FileNotFoundException i BufferedReader moze izbaciti IOException uzimamo Base klasu koja je u ovom slučaju IOException
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader(filename));
			String line = null;
			while((line = reader.readLine()) != null){
				String[] parts = line.split(" ");
				passengers += Integer.valueOf(parts[0]);
			}
		}
		finally{ //Izvršiti će se i bez pokušaja hvatanja Iznimaka, u slučaju errora također će se izvršiti te će Metoda nakon toga pustiti Iznimku da prođe kroz Call stack (Nakon finally)
			if(reader != null){
				reader.close();
			}
		}
	}


public class CargoFlight extends Flight{
	//other members elided for clarity
	@Override
	public void addPassenger(String filename){
		//...
	}
}

public class CargoFlight extends Flight{
	//other members elided for clarity
	@Override
	public void addPassenger(String filename) throws IOException{
		//...
	}
}

public class CargoFlight extends Flight{
	//other members elided for clarity
	@Override
	public void addPassenger(String filename) throws FileNotFoundException{
		//...
	}
}