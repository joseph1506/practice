package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class TestRental {

    public static void main(String args[]) throws EntryNotFoundException {
        List<DVD> dvdListForRental=new ArrayList<DVD>();
        DVD movie1= new DVD("MI1","20INR");
        DVD movie2= new DVD("MI2","30INR");
        dvdListForRental.add(movie1);
        dvdListForRental.add(movie2);
        Rental<DVD> dvdRentalService= new Rental<DVD>(3,dvdListForRental);

        DVD MI1=dvdRentalService.getRental();
        DVD MI2=dvdRentalService.getRental();
        DVD MI3=dvdRentalService.getRental();

    }
}
