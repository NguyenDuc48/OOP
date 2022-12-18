class Movie2 implements Comparable<Movie2> {
    private double rating;
    private String name;
    private int year;


    public Movie2(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int compareTo(Movie2 m) {
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