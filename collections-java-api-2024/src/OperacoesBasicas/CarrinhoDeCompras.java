package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItemCarrinho = new ArrayList<>();

        for(Item item : carrinho){
            if(item.getNome().equalsIgnoreCase(nome)){
                removerItemCarrinho.add(item);
            }
        }

        carrinho.removeAll(removerItemCarrinho);
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Item item : carrinho){
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }


    //Testando...
    public static void main(String[] args) {
        CarrinhoDeCompras cc1 = new CarrinhoDeCompras();

        cc1.adicionarItem("Bermuda", 87.90, 42);
        cc1.adicionarItem("Meia", 13.90, 30);
        cc1.adicionarItem("Mochila", 159.99, 10);

        cc1.exibirItens();

        cc1.removerItem("Bermuda");

        cc1.exibirItens();

        System.out.println("Valor total: "+String.format("%.2f", cc1.calcularValorTotal()));

    }

}
