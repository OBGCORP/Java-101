package MovieSystem;

import java.util.Arrays;

public class Film {
    private String title;
    private int yearReleased;
    private String platform;
    private int duration;
    private String[] category;

    public Film(String title, int yearReleased, String platform, int duration, String[] category) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.platform = platform;
        this.duration = duration;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", yearReleased='" + yearReleased + '\'' +
                ", platform='" + platform + '\'' +
                ", duration=" + duration +
                ", category=" + Arrays.toString(category) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }
}
