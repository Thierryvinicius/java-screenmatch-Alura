package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

/*    ao inves de fazer um pra cada, posso criar um método inclui com a superClass
    public void inclui(Movie m){
        tempoTotal += m.getDurationInMinutes();
    }
    public void inclui(Serie s){
        tempoTotal += s.getDurationInMinutes();
    }
*/
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDurationInMinutes();
   }
}
