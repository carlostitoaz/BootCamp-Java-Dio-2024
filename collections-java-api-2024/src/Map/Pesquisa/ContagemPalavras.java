package Map.Pesquisa;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!this.contagemPalavrasMap.isEmpty()){
            if(this.contagemPalavrasMap.containsKey(palavra))
                this.contagemPalavrasMap.remove(palavra);
            else System.out.println("Palavra não encontrada");
        }else System.out.println("A coleção está vazia");
    }

    public void exibirContagemPalavras(){
        if (!contagemPalavrasMap.isEmpty()){
            System.out.println(contagemPalavrasMap);
        } else System.out.println("A coleção está vazia");
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int valorPalavra = Integer.MIN_VALUE;
        if (!contagemPalavrasMap.isEmpty()){
            for(Map.Entry<String, Integer> chave_valor : contagemPalavrasMap.entrySet()){
                if(chave_valor.getValue() > valorPalavra){
                    valorPalavra = chave_valor.getValue();
                    palavraMaisFrequente = chave_valor.getKey();
                }
            }
        } else System.out.println("A coleção está vazia");
        return palavraMaisFrequente;
    }


    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
        contagemLinguagens.adicionarPalavra("C#", 3);

        contagemLinguagens.exibirContagemPalavras();

        contagemLinguagens.removerPalavra("Java");
        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
