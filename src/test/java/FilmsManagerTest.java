import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager(5);

    @Test
    public void testFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.addingNewFilm("Фильм 1");
        manager.addingNewFilm("Фильм 2");
        manager.addingNewFilm("Фильм 3");
        manager.addingNewFilm("Фильм 4");
        manager.addingNewFilm("Фильм 5");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4", "Фильм 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.addingNewFilm("Фильм 1");
        manager.addingNewFilm("Фильм 2");
        manager.addingNewFilm("Фильм 3");
        manager.addingNewFilm("Фильм 4");
        manager.addingNewFilm("Фильм 5");

        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testAboveLimit() {

        manager.addingNewFilm("Movie 4");
        manager.addingNewFilm("Movie 5");
        manager.addingNewFilm("Movie 6");
        manager.addingNewFilm("Movie 7");

        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
