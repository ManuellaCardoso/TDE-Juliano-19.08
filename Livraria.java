import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void inserirLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado à livraria.");
    }

    public void listarLivros() {
        System.out.println("Lista de livros na livraria:");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }

    public void listarDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livro.exibirDetalhes();
                System.out.println();
            }
        }
    }
}
