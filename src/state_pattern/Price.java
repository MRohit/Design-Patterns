package state_pattern;

public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
    abstract int getFrequentRenterPoints(int daysRented);

}
