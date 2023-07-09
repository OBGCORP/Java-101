package MovieSystem;

public class Category {
    private String name;
    private int movieCount;

    public Category(String name) {
        this.name = name;
        this.movieCount = 0;
    }

    public Category(String name, int movieCount) {
        this.name = name;
        this.movieCount = movieCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", movieCount=" + movieCount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }
}
