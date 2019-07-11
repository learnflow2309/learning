//Klasa
public class Flight{
	int flightNumber;
	char flightClass;
	//other members elided for clarity

	@Override
	public String toString(){
		if(flightNumber > 0){
			return "Flight #" + flightNumber;
		}else{
			return "Flight Class " + flightClass;
		}
	}
}

//Pozivanje izvan Klase

StringBuilder sb = new StringBuilder(40); //Stvara StringBuilder u koji stane 40 znakova
sb.capacity(); //40
Flight myFlight = new Flight(175);
String location = "Florida";

sb.append("I flew to ");//U StringBuilder-u - "I flew to "
sb.append(location);//U StringBuilder-u - "I flew to Florida"
sb.append(" on ");//U StringBuilder-u - "I flew to Florida on "
sb.append(myFlight);//U StringBuilder-u - "I flew to Florida on Flight #175"

int time = 9;
int pos = sb.length() - " on ".length() - myFlight.toString().length;
sb.insert(pos, " at ");//U StringBuilder-u - "I flew to Florida at on Flight #175"
sb.insert(pos + 4, time);//U StringBuilder-u - "I flew to Florida at 9 on Flight #175"
String message = sb.toString(); //message - "I flew to Florida at 9 on Flight #175"