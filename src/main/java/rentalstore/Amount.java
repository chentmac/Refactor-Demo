package rentalstore;

abstract class Amount {
    abstract int getPriceCode();

    public abstract double getFinalAmount(int daysRented);
}
