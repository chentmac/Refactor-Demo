package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    Movie getMovie() {
        return movie;
    }

    double getFrequentRentalPoints() {
        return movie.getFrequentRentalPoints(dayRented);
    }
    double getFinalAmount(){
        return movie.getFinalAmount(dayRented);
    }
}
