/*
crew.txt
Pilot,Patty
Pilot,Paul
CoPilot,Karl
CoPilot,Karen
FlightAttendant,Fred
FlightAttendant,Phyllis
FlightAttendant,Frank
FlightAttendant,Fiona
AirMarshal, Ann
AirMarshal, Alan
*/

//Klasa
public class CrewManager{
	private final static String FILENAME = "crew.txt";
	private static CrewMember[] pool;
	public static CrewMember FindAvailable(FlightCrewJob job){
		CrewMember cm = null;
		for (int i=0; i<pool.length; i++) {
			if (pool[i] != null && pool[i].job == job) {
				cm = pool[i];
				pool[i] = null;
				break;
			}
		}
		return cm;
	} //other members temporarily elided
	//Static Initialization block
	static{
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader(new File("crew.txt")));
			String line = null;
			int idx = 0;
			pool = new CrewMember[10];
			while((line = reader.readLine()) != null){
				String[] parts = line.split(",");
				FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
				pool[idx] = new CrewMember(job);
				pool[idx].setName(parts[1]):
				idx++;
			}
		}
		catch(IOException e){
			//handle error
		}
	}
} //class CrewManager

//Pozivanje izvan klase
CrewMember p = CrewManager.FindAvailable(FlightCrewJob.Pilot);

CrewMember c = CrewManager.FindAvailable(FlightCrewJob.CoPilot);

CrewMember a = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);