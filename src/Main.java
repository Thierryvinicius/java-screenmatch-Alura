import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.filtroRecomendacao;
import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;


public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseDate(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.exibirFichaTecnica();

        myMovie.avalia(8);
        myMovie.avalia(8);
        myMovie.avalia(10);
        System.out.println(myMovie.obterMedia());
        System.out.println("Total de avaliações: " + myMovie.getTotalReview());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseDate(2000);
        lost.exibirFichaTecnica();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisodes(50);
        System.out.println("Duração para maratonar a série " + lost.getName() + ": " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setReleaseDate(2023);
        otherMovie.setDurationInMinutes(200);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(myMovie);
        calc.inclui(otherMovie);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        filtroRecomendacao filtro = new filtroRecomendacao();
        filtro.filtra(myMovie);

        Episodes episodio = new Episodes();
        episodio.setNum(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}