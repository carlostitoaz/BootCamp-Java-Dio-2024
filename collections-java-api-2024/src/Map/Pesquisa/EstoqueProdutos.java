package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if(!estoqueProdutoMap.isEmpty()){
            System.out.println(this.estoqueProdutoMap);
        }else{
            System.out.println("O coleção está vazia!");
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
               if(p.getPreco() > maiorPreco){
                   maiorPreco = p.getPreco();
                   produtoMaisCaro = p;
               }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorValorPorQuantidade = null;
        double produtoValor = Double.MIN_VALUE;
        double produtoValorAtual;
        if(!estoqueProdutoMap.isEmpty()){
            for(Map.Entry<Long, Produto> chave_e_valor : estoqueProdutoMap.entrySet()){
                produtoValorAtual = chave_e_valor.getValue().getPreco() * chave_e_valor.getValue().getQuantidade();
                if(produtoValorAtual > produtoValor){
                    produtoValor = produtoValorAtual;
                    produtoMaiorValorPorQuantidade = chave_e_valor.getValue();
                }
            }
        }
        return produtoMaiorValorPorQuantidade;
    }

    //Testando...
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5d);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10d);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15d);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
