package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.addElement(rental);
    }

    private String getName() {
        return name;
    }

    public String statement(){
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while(rentals.hasMoreElements()){
            Rental rental = (Rental) rentals.nextElement();
            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(String.valueOf(rental.getFinalAmount())).append("\n");
        }
        //add footer lines
        result.append("Amount owed is").append(String.valueOf(getTotalAmount())).append("\n");
        result.append("You earned").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");
        return result.toString();
    }
    public String htmlStatement(){
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("<H1>Rental for <EM>" + getName() + "</EM></H1><P>\n");
        while(rentals.hasMoreElements()){
            Rental rental = (Rental) rentals.nextElement();
            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(String.valueOf(rental.getFinalAmount())).append("<BR>\n");
        }
        //add footer lines
        result.append("<P>You owed<EM>").append(String.valueOf(getTotalAmount())).append("</EM><P>\n");
        result.append("On this rental you earned<EM>").append(getTotalFrequentRenterPoints()).append("</EM> frequent renter points<P>");
        return result.toString();
    }

    private String getTotalFrequentRenterPoints() {
        int index=0;
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getFrequentRentalPoints();
        }
        if(String.valueOf(result).endsWith(".0")){
            index=String.valueOf(result).indexOf(".0");
            return String.valueOf(result).substring(0,index);
        }
        return String.valueOf(result);
    }

    private double getTotalAmount() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getFinalAmount();
        }
        return result;
    }
}
