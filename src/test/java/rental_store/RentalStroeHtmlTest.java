package rental_store;

import org.junit.Test;
import rentalstore.Customer;
import rentalstore.Movie;
import rentalstore.Rental;

import static org.junit.Assert.assertEquals;

public class RentalStroeHtmlTest {
    private Customer customer = new Customer("Jerry");
    @Test
    public void should_return_correct_htmlstatement_given_customer_has_no_rental() {
        String htmlStatement = customer.htmlStatement();
        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "<P>You owed<EM>0.0</EM><P>\n" +
                "On this rental you earned<EM>0</EM> frequent renter points<P>", htmlStatement);
    }
    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_regular_movie_for_1_day() {
        Movie regularMovie = new Movie("Sherlock Holmes", 0);
        Rental oneDayRental = new Rental(regularMovie, 1);
        customer.addRental(oneDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t2.0<BR>\n" +
                "<P>You owed<EM>2.0</EM><P>\n" +
                "On this rental you earned<EM>1</EM> frequent renter points<P>", htmlStatement);
    }
    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_regular_movie_for_3_day() {
        Movie regularMovie = new Movie("Sherlock Holmes", 0);
        Rental threeDayRental = new Rental(regularMovie, 3);
        customer.addRental(threeDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t3.5<BR>\n" +
                "<P>You owed<EM>3.5</EM><P>\n" +
                "On this rental you earned<EM>1</EM> frequent renter points<P>", htmlStatement);
    }

    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        Movie newReleaseMovie = new Movie("Sherlock Holmes", 1);
        Rental oneDayRental = new Rental(newReleaseMovie, 1);
        customer.addRental(oneDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t3.0<BR>\n" +
                "<P>You owed<EM>3.0</EM><P>\n" +
                "On this rental you earned<EM>1</EM> frequent renter points<P>", htmlStatement);
    }

    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        Movie newReleaseMovie = new Movie("Sherlock Holmes", 1);
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        customer.addRental(twoDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t6.0<BR>\n" +
                "<P>You owed<EM>6.0</EM><P>\n" +
                "On this rental you earned<EM>2</EM> frequent renter points<P>", htmlStatement);
    }

    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_child_movie_for_1_day() {
        Movie childrenMovie = new Movie("Sherlock Holmes", 2);
        Rental oneDayRental = new Rental(childrenMovie, 1);
        customer.addRental(oneDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t1.5<BR>\n" +
                "<P>You owed<EM>1.5</EM><P>\n" +
                "On this rental you earned<EM>1</EM> frequent renter points<P>", htmlStatement);
    }

    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new Movie("Sherlock Holmes", 2);
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.addRental(fourDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t3.0<BR>\n" +
                "<P>You owed<EM>3.0</EM><P>\n" +
                "On this rental you earned<EM>1</EM> frequent renter points<P>", htmlStatement);
    }
    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_literary_movie_for_1_day() {
        Movie literaryMovie = new Movie("Sherlock Holmes", 3);
        Rental oneDayRental = new Rental(literaryMovie, 1);
        customer.addRental(oneDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t6.0<BR>\n" +
                "<P>You owed<EM>6.0</EM><P>\n" +
                "On this rental you earned<EM>1.5</EM> frequent renter points<P>", htmlStatement);
    }

    @Test
    public void should_return_correct_htmlstatement_given_customer_has_rent_one_literary_movie_for_2_day() {
        Movie literaryMovie = new Movie("Sherlock Holmes", 3);
        Rental twoDayRental = new Rental(literaryMovie, 2);
        customer.addRental(twoDayRental);

        String htmlStatement = customer.htmlStatement();

        assertEquals("<H1>Rental for <EM>Jerry</EM></H1><P>\n" +
                "\tSherlock Holmes\t12.0<BR>\n" +
                "<P>You owed<EM>12.0</EM><P>\n" +
                "On this rental you earned<EM>1.5</EM> frequent renter points<P>", htmlStatement);
    }
}
