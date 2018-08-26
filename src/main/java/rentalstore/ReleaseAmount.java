package rentalstore;

public class ReleaseAmount extends Amount{
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getFinalAmout(int daysRented) {
        return daysRented * 3;
    }
}
