package br.com.audioplace.modelos;

public class Audio {
    protected String titulo;
    protected int totalReproducoes;
    protected int totalCurtidas;

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    /*calcula a classificação da musica usando
      a proporção de total de curtidas para o total de reproduções*/
    public double getClassificacao() {
        return 0;
    }
}
