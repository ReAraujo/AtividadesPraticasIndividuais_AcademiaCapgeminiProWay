package model;

public class Serie extends Filme{
    public String emissora;
    public int quantidadeDeTemporadas;
    public int quantidadeDeEpisodios;

    @Override
    public String toString() {
        String impressao2 = "\n\tEmissora: " + this.emissora +
                            "\n\tQuantidade de Temporadas: " + this.quantidadeDeTemporadas +
                            "\n\tQuantidade de Episódios: " + this.quantidadeDeEpisodios;
        return super.toString() + impressao2;
    }

    
    
}
