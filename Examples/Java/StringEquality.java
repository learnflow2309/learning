String s1 = "I Love";
s1 += " Java";

String s2 = "I";
s2 += " Love Java";

if(s1 == s2){ //false - zato što == uspoređuje da li je i ista instanca u pitanju, a s1 i s2 su različite instance
	//do something
}

if(s1.equals(s2)){ //true - uspoređuje jedan po jedan znak stringova sve dok je prethodno obavljena usporedna istinita ili nije kraj stringova http://prntscr.com/k329ys
	//do someething
}

String s3 = s1.intern();
String s4 = s2.intern();

if(s3 == s4){ //true - zato što == uspoređuje da li je i ista instanca u pitanju, a s3 i s4 su iste instance (na string u pool/u String klase)
	//do something
}