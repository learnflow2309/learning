//Paket com.pluralsight.travel
package com.pluralsight.travel;
public class Flight{...}

package com.pluralsight.travel:
public class Passenger{...}

//Paket com.xyzcompany.bar
package com.xyzcompany.bar;
public class Beer{...}

package com.xyzcompany.bar;
public class Wine{...}

//Stvaranje aplikacije
import com.pluralsight.travel.Flight;
import com.xyzcompany.bar.Beer;
import com.pluralsight.travel.Passenger;
import com.xyzcompany.bar.Wine;

Fligh lax175 = new Flight(175); //Import definira da se koristi Flight iz paketa com.pluralsight.travel
Beer liteBeer = new Beer(); //Import definira da se koristi Beer iz paketa com.xyzcompany.bar
Passenger jane = new Passenger(); //Import definira da se koristi Passenger iz paketa com.pluralsight.travel
Wine merlot = new Wine(); //Import definira da se koristi Wine iz paketa com.xyzcompany.bar
