package rental_store;


import org.junit.Rule;
import org.junit.rules.ExpectedException;
import rentalstore.Movie;
import rentalstore.Rental;
import org.junit.Test;
import rentalstore.Customer;

import static org.junit.Assert.assertEquals;

public class RentalStoreTest {
    private Customer customer = new Customer("Jerry");
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        //GIVEN
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "Amount owed is0.0\n" +
                "You earned0 frequent renter points", statement);
    }
    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_1_day() {
        //GIVEN
        Movie regularMovie = new Movie("Sherlock Holmes", 0);
        Rental oneDayRental = new Rental(regularMovie, 1);
        customer.addRental(oneDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t2.0\n" +
                "Amount owed is2.0\n" +
                "You earned1 frequent renter points", statement);
    }
    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_3_day() {
        //GIVEN
        Movie regularMovie = new Movie("Sherlock Holmes", 0);
        Rental threeDayRental = new Rental(regularMovie, 3);
        customer.addRental(threeDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t3.5\n" +
                "Amount owed is3.5\n" +
                "You earned1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        //GIVEN
        Movie newReleaseMovie = new Movie("Sherlock Holmes", 1);
        Rental oneDayRental = new Rental(newReleaseMovie, 1);
        customer.addRental(oneDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t3.0\n" +
                "Amount owed is3.0\n" +
                "You earned1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        //GIVEN
        Movie newReleaseMovie = new Movie("Sherlock Holmes", 1);
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        customer.addRental(twoDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t6.0\n" +
                "Amount owed is6.0\n" +
                "You earned2 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_1_day() {
        //GIVEN
        Movie childrenMovie = new Movie("Sherlock Holmes", 2);
        Rental oneDayRental = new Rental(childrenMovie, 1);
        customer.addRental(oneDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t1.5\n" +
                "Amount owed is1.5\n" +
                "You earned1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        //GIVEN
        Movie childrenMovie = new Movie("Sherlock Holmes", 2);
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.addRental(fourDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t3.0\n" +
                "Amount owed is3.0\n" +
                "You earned1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_literary_movie_for_1_day() {
        //GIVEN
        Movie literaryMovie = new Movie("Sherlock Holmes", 3);
        Rental oneDayRental = new Rental(literaryMovie, 1);
        customer.addRental(oneDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t6.0\n" +
                "Amount owed is6.0\n" +
                "You earned1.5 frequent renter points", statement);
    }
    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_literary_movie_for_2_day() {
        //GIVEN
        Movie literaryMovie = new Movie("Sherlock Holmes", 3);
        Rental twoDayRental = new Rental(literaryMovie, 2);
        customer.addRental(twoDayRental);
        //WHEN
        String statement = customer.statement();
        //THEN
        assertEquals("Rental Record for Jerry\n" +
                "\tSherlock Holmes\t12.0\n" +
                "Amount owed is12.0\n" +
                "You earned1.5 frequent renter points", statement);
    }

    @Test
    public void should_throw_illegalArgumentException_with_message_illegal_price_code() {
        thrown.expect(java.lang.IllegalArgumentException.class);
        thrown.expectMessage("illegal price code");
        Movie literaryMovie = new Movie("Sherlock Holmes", 4);
    }
}
