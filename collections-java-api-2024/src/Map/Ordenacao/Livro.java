package Map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro{
    private String titulo, autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}'+"\n";
    }
}

class livroComparatorPorPrecoCrescente implements Comparator<Map.Entry<String, Livro>> {
    //Exibe os livros da livraria em ordem crescente de preço.
    @Override
    public int compare(Map.Entry<String, Livro> chave_valor1, Map.Entry<String, Livro> chave_valor2) {
        return Double.compare(chave_valor1.getValue().getPreco(), chave_valor2.getValue().getPreco());
    }
}

class livroComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{
    //Comparando o autor do livro para ordenar.
    @Override
    public int compare(Map.Entry<String, Livro> entry1, Map.Entry<String, Livro> entry2) {
        return entry1.getValue().getAutor().compareToIgnoreCase(entry2.getValue().getAutor());
    }
}


