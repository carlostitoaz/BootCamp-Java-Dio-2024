package Map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livraliaOnlineMap;

    public LivrariaOnline(){
        this.livraliaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        this.livraliaOnlineMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        Map<String, Livro> livrosParaRemover = new HashMap<>();
        if(!this.livraliaOnlineMap.isEmpty()){
            for(var livro_chave_valor : livraliaOnlineMap.entrySet()){
                if(livro_chave_valor.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrosParaRemover.put(livro_chave_valor.getKey(), livro_chave_valor.getValue());
                }
            }
            for(Map.Entry<String, Livro> livro_chave_valor : livrosParaRemover.entrySet()){
                livraliaOnlineMap.remove(livro_chave_valor.getKey());
            }
        }else{
            System.out.println("A coleção está vazia.");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenadosPorPrecoLista = new ArrayList<>(livraliaOnlineMap.entrySet());//Colocando cada entrada dentro de uma lista

        Collections.sort(livrosOrdenadosPorPrecoLista, new livroComparatorPorPrecoCrescente());//Ordenando por valor.

        Map<String, Livro> livrosOrdenadosPorPrecoMap = new LinkedHashMap<>();//Criando um Map utilizando o LinkedHashMap para manter os dados na mesma ordem que for colocado na entrada

        for(Map.Entry<String, Livro> entry : livrosOrdenadosPorPrecoLista){//Acessando a lista e pegando cada entrada do conjunto chave valor e colocando dentro de um Map.
            livrosOrdenadosPorPrecoMap.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPrecoMap;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosOrdenadosPorAutorList = new ArrayList<>(livraliaOnlineMap.entrySet());

        Collections.sort(livrosOrdenadosPorAutorList, new livroComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutorMap = new LinkedHashMap<>();

        for (var entry : livrosOrdenadosPorAutorList) {
            livrosOrdenadosPorAutorMap.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutorMap;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosOrdenadosPorAutorMap = exibirLivrosOrdenadosPorAutor();
        Map<String, Livro> pesquisalivrosOrdenadosPorAutorMap = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosOrdenadosPorAutorMap.entrySet()){
            //if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
            //if(entry.getValue().getAutor().startsWith(autor)){
            if(entry.getValue().getAutor().toLowerCase().startsWith(autor.toLowerCase())){
                pesquisalivrosOrdenadosPorAutorMap.put(entry.getKey(), entry.getValue());
            }
        }
        return pesquisalivrosOrdenadosPorAutorMap;
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livroMaisCaroList = new ArrayList<>();
        double livroMaisCaro = Double.MIN_VALUE;

        if(!livraliaOnlineMap.isEmpty()){
            for(var entry : livraliaOnlineMap.entrySet()){
                if(entry.getValue().getPreco() > livroMaisCaro){
                    livroMaisCaro = entry.getValue().getPreco();
                    livroMaisCaroList.clear();
                    livroMaisCaroList.add(entry.getValue());

                } else if (entry.getValue().getPreco() == livroMaisCaro) {
                    livroMaisCaroList.add(entry.getValue());
                }
            }
        }else{
            throw new NoSuchElementException("A coleção está vazia");
        }

        return livroMaisCaroList;
    }

    public List<Livro> exibirLivroMaisBarato(){
        List<Livro> livroMaisBaratoList = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if(!livraliaOnlineMap.isEmpty()){
            for(Livro livro : livraliaOnlineMap.values()){
                if(livro.getPreco() < precoMaisBaixo){
                    precoMaisBaixo = livro.getPreco();
                }
            }

            for(Map.Entry<String, Livro> entry : livraliaOnlineMap.entrySet()){
                if(entry.getValue().getPreco() == precoMaisBaixo){
                    Livro livroComPrecoMaisBaixo = livraliaOnlineMap.get(entry.getKey());
                    livroMaisBaratoList.add(livroComPrecoMaisBaixo);
                }
            }
        }else{
            throw new NoSuchElementException("A coleção está vazia");
        }
        return livroMaisBaratoList;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("link teste", "titulo teste", "George teste", 11.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        System.out.println("Livros não ordenados: \n"+livrariaOnline.livraliaOnlineMap);

        System.out.println("Livros ordenados por preço: \n"+livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros ordenados por autor: \n"+livrariaOnline.exibirLivrosOrdenadosPorAutor());

        //System.out.println("Resultado da busca por autor: \n"+livrariaOnline.pesquisarLivrosPorAutor("george orwell"));
        System.out.println("Resultado da busca por autor: \n"+livrariaOnline.pesquisarLivrosPorAutor("george"));
        //System.out.println("Resultado da busca por autor: \n"+livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));

        System.out.println("Livros mais caro: \n"+livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livros mais barato: \n"+livrariaOnline.exibirLivroMaisBarato());

        livrariaOnline.removerLivro("E Não Sobrou Nenhum");
        System.out.println("Após remover um livro: \n"+livrariaOnline.livraliaOnlineMap);

    }
}