package rentalstore;

public class LiteraryAmount extends Amount {
    int getPriceCode() {
        return Movie.LITERARY;
    }

    public double getFinalAmount(int daysRented) {
        return 6.0 * daysRented;
    }
}
