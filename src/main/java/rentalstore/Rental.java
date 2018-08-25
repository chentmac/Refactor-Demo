package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }
    double getFinalAmount() {
        double amount = 0;
        switch (getMovie().getPriceCode()){
            case Movie.REGULAR:
                amount += 2;
                if(getDayRented() > 2){
                    amount+=(getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount+=getDayRented()*3;
                break;
            case Movie.CHILDRENS:
                amount+=1.5;
                if(getDayRented() > 3){
                    amount += (getDayRented() -3)*1.5;
                }
                break;
        }
        return amount;
    }

    int getFrequentRentalPoints() {
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
