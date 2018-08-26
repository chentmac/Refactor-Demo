package rentalstore;

public class Movie {
    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String title;

    private Amount amount;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    private int getPriceCode() {
        return amount.getPriceCode();
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode){
            case REGULAR:
                amount = new RegularAmount();
                break;
            case CHILDRENS:
                amount = new ChildrensAmount();
                break;
            case NEW_RELEASE:
                amount = new ReleaseAmount();
                break;
            default:
                break;
        }
    }

    String getTitle() {
        return title;
    }

    double getFinalAmount(int daysRented) {
        return amount.getFinalAmout(daysRented);
    }

    int getFrequentRentalPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) &&  daysRented> 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
