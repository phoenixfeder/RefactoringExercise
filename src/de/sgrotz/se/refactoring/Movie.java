package de.sgrotz.se.refactoring;

public class Movie {
    private static final int CHILDRENS = 2;
    private static final int REGULAR = 0;
    private static final int NEW_RELEASE = 1;
    private String _name;
    private Price _price;

    static abstract class Price {
        abstract double getCharge(int daysRented);

        int getFrequentRenterPoints(int daysRented) {
            return 1;
        }
    }

    static class ChildrenPrice extends Price {

        double getCharge(int daysRented) {
            double result = 1.5;
            if (daysRented > 3)
                result += (daysRented - 3) * 1.5;
            return result;
        }
    }

    static class NewReleasePrice extends Price {

        double getCharge(int daysRented) {
            return daysRented * 3;
        }

        int getFrequentRenterPoints(int daysRented) {
            return (daysRented > 1) ? 2 : 1;
        }
    }

    static class RegularPrice extends Price {

        double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        }
    }


    public Movie(String name, int priceCode) {
        _name = name;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getName() {
        return _name;
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
}