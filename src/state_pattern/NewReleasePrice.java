package state_pattern;

public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return 1;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        if(daysRented>1)
            return 2;
        return 1;
    }
}
