import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;
    private List<Artista> artistas;

    public Catalogo() {
        this.discos = new ArrayList<>();
        this.artistas = new ArrayList<>();
    }

    public void cadastrarDisco(String titulo, int anoLancamento, List<String> faixas) {
        Disco disco = new Disco(titulo, anoLancamento);
        faixas.forEach(disco::adicionarFaixa);
        discos.add(disco);
    }

    public void cadastrarArtista(String nome, String genero, String tituloDisco) {
        Artista artista = new Artista(nome, genero);
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                disco.setArtista(artista);
                break;
            }
        }
        artistas.add(artista);
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            discos.forEach(System.out::println);
        }
    }

    public void editarDisco(String titulo, String novoTitulo, int novoAnoLancamento) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                disco.setTitulo(novoTitulo);
                disco.setAnoLancamento(novoAnoLancamento);
                break;
            }
        }
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public void listarArtistas() {
            artistas.forEach(System.out::println);
    }
}

