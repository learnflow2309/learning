//Klasa
public abstract class Pilot{
	private Flight currentFlitght;

	public void fly(Flight f){
		if(canAccept(f)){
			currentFlitght = f;
		}else{
			handleCantAccept();
		}
	}

	public abstract boolean canAccept(Flight f);

	private void handleCantAccept(){
		System.out.println("Can't accept")
	}
}

//Produženje klase
public class CargoOnlyPilot extends Pilot{
	@Override
	public boolean canAccept(Flight f){
		return f.getPassengers() == 0;
	}

}

//Produženje klase (drugi primjer)
public class FullLicensePilot extends Pilot{
	@Override
	public boolean canAccept(Flight f){
		return true;
	}

}