package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        //Iniciando a lista e conlocando a lista 'pessoalist' dentro dela
        //Utilizando Comparable
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        //Utilizando Comparetor
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoa op1 = new OrdenacaoPessoa();

        op1.adicionarPessoa("Nome 1", 20, 1.56);
        op1.adicionarPessoa("Nome 2", 30, 1.80);
        op1.adicionarPessoa("Nome 3", 25, 1.70);
        op1.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(op1.ordenarPorIdade());
        System.out.println(op1.ordenarPorAltura());

        System.out.println(op1.pessoaList);
    }

}
