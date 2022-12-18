class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;


    public Movie() {

    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
 