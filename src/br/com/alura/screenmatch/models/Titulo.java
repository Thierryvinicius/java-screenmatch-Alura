package br.com.alura.screenmatch.models;

public class Titulo {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private int totalReview;
    private double movieReview;
    private boolean includedPlan;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public double getMovieReview() {
        return movieReview;
    }

    public int getTotalReview(){
        return totalReview;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void exibirFichaTecnica(){
        System.out.println("Movie name: " + name);
        System.out.println("Release Date: " + releaseDate);
    }

    public void avalia(double nota){
        movieReview += nota;
        totalReview++;
    }

    public double obterMedia(){
        return movieReview / totalReview;
    }
}
