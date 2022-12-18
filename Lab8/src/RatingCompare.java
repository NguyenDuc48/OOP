import java.util.Comparator;

class RatingCompare implements Comparator<Movie2> {
    public int compare(Movie2 m1, Movie2 m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}