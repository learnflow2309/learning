Integer a = 100; //a je instanca Integer wrapper klase no 100 je integer vrijednost
//Java će se automatski pobrinuti za dohvaćanje refernce do instance Integer wrapper klase sa rijednosti 100 unutar nje
int b = a; //Java će povući vrijednost 100 iz Integer wrapper instance i spremiti pod b
Integer c = b; //Java će povezati Instancu Integer Wrapper klase koja sadrži vrijednost 100

Integer d = Integer.valueOf(100); //Uzima Primitivni tip 100 i vraća nam referncu Integer Wrapper koja sadrži vrijednost 100
int e = d.intValue(); //Uzima vrijednost iz Integer Wrapper class instance d
Integer f = Integer.valueOf(e); //Uzima Primitivni tip e i vraća nam referencu Integer Wrapper klase koja sadrži vrijednost 100


Integer a = 100; //Je isto što i Integer a = Integer.valueOf(100); , samo što je raspisano bez da Java sama odrađuje pretvorbu
//Što se tiče pretvorbe Integer.valueOf(100), nakon Jave 5 više ju nije potrebno koristiti pošto Java sama odrađuje pretvorbu
//Ne odnosi se samo na Integer Wrapper klasu:

Float g = Float.valueOf(18.125f);
Float h = g.floatValue();

///////////////////////////////////////////////////////////////////////////////////////

String s = "87.44";
double s1 = Double.parseDouble(s); //Double wrapper klasa vraća primitivnu vrijednost 87.44d;
Double s2 = Double.valueOf(s); //Double wrapper klasa vraća intancu na String klasu koja sadrži vrijednost "87.44"
