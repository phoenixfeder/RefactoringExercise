import de.sgrotz.se.refactoring.Movie;
import de.sgrotz.se.refactoring.Rental;
import org.junit.jupiter.api.Test;

class RentalTest {

    @Test
    void getDaysRented() {
        Rental rental = new Rental(new Movie("title", 2), 2);
        assert (rental.getDaysRented() == 2);
    }

    @Test
    void getMovie() {
        Movie movie = new Movie("title", 2);
        Rental rental = new Rental(movie, 2);
        assert (rental.getMovie() == movie);
    }
}