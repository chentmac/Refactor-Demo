package rentalstore;

abstract class Amount {
    abstract int getPriceCode();

    public abstract double getFinalAmout(int daysRented);
}
