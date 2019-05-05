package de.sgrotz.se.refactoring;

import org.junit.jupiter.api.Test;

class RentalTest {

    @Test
    public void getDaysRented() {
        Rental rental = new Rental(new Movie("title", 2), 2);
        assert (rental.getDaysRented() == 2);
    }

    @Test
    public void getMovie() {
        Movie movie = new Movie("title", 2);
        Rental rental = new Rental(movie, 2);
        assert (rental.getMovie() == movie);
    }
}