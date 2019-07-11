return-type name (typed-paremeter-list) {
	statements
}

//Klasa
public class MyClass{
	public void showSum (float x, float y, int count) {
		float sum = x + y;
		for (int i = 0; i < count; i++)
			System.out.println(sum);
	}
}

//Pozivanje izvan klase
MyClass m = new MyClass();
m.showSum(7.5f, 1.4f, 3);
//8.9
//8.9
//8.

//Klasa
public class MyClass{
    public void showSum (float x, float y, int count) {
    	//Petlja koja će ubrzati proces izvršavanja metode
    	if (count < 1) {
    		return; 
    	}
        float sum = x + y;
        for (int i = 0; i < count; i++)
                System.out.println(sum);
        return;
    }
}

//Pozivanje izvan klase
MyClass m = new MyClass();
m.showSum(7.5f, 1.4f, 0);
System.out.println("I'm back");
//I'm back