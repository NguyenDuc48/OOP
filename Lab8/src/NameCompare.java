import java.util.Comparator;

class NameCompare implements Comparator<Movie2> {
    public int compare(Movie2 m1, Movie2 m2) {
        return m1.getName().compareTo(m2.getName());
    }
}