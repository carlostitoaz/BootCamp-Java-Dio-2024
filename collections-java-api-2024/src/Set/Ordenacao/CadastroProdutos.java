package Set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoOrdenadoPorNome = new TreeSet<>(produtoSet); //A implementação TreeSet aceita o comparable
        return produtoOrdenadoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosProPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosProPreco.addAll(produtoSet);
        return produtosProPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Abacate", 4d, 30);
        cadastroProdutos.adicionarProduto(2L, "Uva", 5.35d, 15);
        cadastroProdutos.adicionarProduto(3L, "Cebola", 2.50d, 45);
        cadastroProdutos.adicionarProduto(4L, "Banana", 7.98d, 12);
        cadastroProdutos.adicionarProduto(5L, "Abacaxi", 6.80d, 8);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        //System.out.println(cadastroProdutos.produtoSet);

    }






}
