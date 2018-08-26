package rentalstore;

public class RegularAmount extends Amount{
    int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getFinalAmount(int daysRented) {
        double amount = 2;
        if (daysRented>2){
            amount+=(daysRented-2)*1.5;
        }
        return amount;
    }
}
