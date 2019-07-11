1

//Pozivanje Metode
int val1 = 10; //U memoriji: val1->10
int val2 = 20; //U memoriji: val2->20
System.out.println(val1, " ", val2); //10 20
swap(val1, val2); //U memoriji: i->10, j->20
System.out.println(val1, " ", val2); //10 20

//Izvršavanje Metode
void swap(int i, int j){
	int k = i; //U memoriji: k->10
	i = j; //U memoriji: i->20
	j = k; //U memoriji: j->10
	System.out.println(i, " ", j); //20 10
}

2
//Klasa
public class Flight{
	int flightNumber;
	//accessor & mutator elided for clarity

	public Flight(){
		this.flightNumber = flightNumber;	
	}

	//other members elided for clarity
}

//Izvršavanje Metode
void swap(Fligh i, Flight j){
	Fligh k = i; //k->val1->flightNumber
	i = j; // i->val2->flightNumber
	j = k; // j->val1->flightNumber
	//print i & j flight # //20 10
}

//Pozivanje Konstruktora i Metode
Flight val1 = new Flight(10); //U memoriji: val1->flightNumber:10
Flight val2 = new Flight(20); //U memoriji: val2->flightNumber:20
//print val1 & val2 flight # //10 20
swap(val1, val2); //U memoriji: i->val1->flightNumber, j->val2->flightNumber
//print val1 & val2 flight # //10 20

3
//Pozivanje Konstruktora i Metode
Flight val1 = new Flight(10); //U memoriji: val1->flightNumber:10
Flight val2 = new Flight(20); //U memoriji: val2->flightNumber:20
//print val1 & val2 flight # //10 20
swapNumbers(val1, val2); //U memoriji: i->val1->flightNumber, j->val2->flightNumber
//print val1 & val2 flight # //20 10

//Izvršavanje Metode
void swapNumbers(Fligh i, Flight j){
	int k = i.getFlightNumber(); //U memoriji: k->val1>flightNumber:10
	i.setFlightNumber(j.getFlightNumber()); //U memoriji: i->val2->flightNumber:20
	j.setFlightNumber(k); //U memoriji: j->val2->flightNumber:k->10
}