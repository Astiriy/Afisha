import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    String film1 = "Film 1";
    String film2 = "Film 2";
    String film3 = "Film 3";
    String film4 = "Film 4";
    String film5 = "Film 5";
    String film6 = "Film 6";
    String film7 = "Film 7";
    String film8 = "Film 8";
    String film9 = "Film 9";
    String film10 = "Film 10";

    @Test
    public void TestingFilms() {

        Afisha afisha = new Afisha();

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);
        afisha.add(film8);
        afisha.add(film9);
        afisha.add(film10);

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"
        };
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestingFindLast() {
        Afisha afisha = new Afisha(10);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);
        afisha.add(film6);
        afisha.add(film7);
        afisha.add(film8);
        afisha.add(film9);
        afisha.add(film10);

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1",
        };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestingFindLastLimit5() {
        Afisha afisha = new Afisha(5);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1",
        };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestingFindLastLimitLowerThenLength() {
        Afisha afisha = new Afisha(4);

        afisha.add(film1);
        afisha.add(film2);
        afisha.add(film3);
        afisha.add(film4);
        afisha.add(film5);

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2",
        };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

