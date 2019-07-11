//Enumerator
public enum FlightCrewJob{
	Pilot,
	CoPilot,
	FlightAttendant,
	AirMarshal
}

//Klasa
public class CrewMember{
	private FlightCrewJob job;
	//other members elided for clarity

	public CrewMember(FlightCrewJob job){
		this.job = job;
	}

	public void setJob(FlightCrewJob job){
		this.job = job;
	}
}

//Pozivanje izvan Klase
CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);

//Prolazi vrijeme, judy dobila promaknuće
CrewMember judy.setJob(FlightCrewJob.Pilot); 