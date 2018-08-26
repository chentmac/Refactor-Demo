package rentalstore;

public class ChildrensAmount extends Amount{
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getFinalAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented>3){
            amount += (daysRented-3) * 1.5;
        }
        return amount;
    }
}
