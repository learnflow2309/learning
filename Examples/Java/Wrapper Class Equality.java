Integer i1000A = 10 * 10 * 10; //U memoriji: 1000
Integer i1000B = 100 * 10; //U memoriji: 1000

if(i1000A == i1000B){ //false - posto gleda da li je ista referenca na objekt (U ovom slučaju nije)
	//do something
}

if(i1000A.equals(i1000B)){ //true - posto gleda vrijednost koja je spremljena u svakom od objekata
	//do something
}

Integer i8A = 4 * 2;
Integer i8B = 2 * 2 * 2;

if(i8A == i8B){ //true - pošto Java kod specifičnih Boxing-a uvijek vraća istu instancu Wrapper klase (int, short, byte, char, boolean - od -128 do 127, od '\u0000' do '\u00ff' i true / false)
	//do something
}