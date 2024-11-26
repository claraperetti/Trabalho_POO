import java.util.ArrayList;
import java.util.List;

class Disco {
    private String titulo;
    private int anoLancamento;
    private Artista artista;
    private List<String> faixas;

    public Disco(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
    }

    @Override
    public String toString() {
        return "Disco: " + titulo + " | Ano: " + anoLancamento + " | " +
                (artista != null ? artista : "Artista não encontrado") +
                " | Faixas: " + faixas;
    }
}